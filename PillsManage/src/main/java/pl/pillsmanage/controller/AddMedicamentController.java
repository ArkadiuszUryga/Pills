package pl.pillsmanage.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.pillsmanage.entity.Dosage;
import pl.pillsmanage.entity.Medicaments;
import pl.pillsmanage.repository.MedicamentRepository;

@Controller
public class AddMedicamentController {
	@Autowired
	private MedicamentRepository medicamentrepository;
	@RequestMapping(value = "/addMedicament", method = RequestMethod.GET)
	
public String addMedicamentGet (Model model, HttpSession ses)	{
		
		Medicaments medicaments = new Medicaments();
		model.addAttribute("medicaments", medicaments);
		
		return "add_medicament";
		
	}
	
	@RequestMapping(value = "/addMedicament", method = RequestMethod.POST)
	
	public String addMedicamentPost(@ModelAttribute Medicaments medicaments, Model model, HttpSession ses) {
		//szukam w zapisanych wcześniej w bazie lekach, czy nie ma już leku o teym samym kodzie kreskowym
		int found=medicamentrepository.countByEan(medicaments.getEan());
		
		//jeżeli jest chcę przekierować ponownie do strony wpisywania leku, z odpowiednią informacją
		if(found>0) {
			medicaments.setDoubledEan(1);
			return "add_medicament";
		}
		//jeżeli nie ma, zapisujemy pacjenta w bazie
			medicamentrepository.save(medicaments);
				//usuwam z sesji starego leka (może ktoś wpisywał dwóch lub więcej na raz) i wstawiam nowego.
				ses.removeAttribute("medicaments");
				ses.setAttribute("medicaments", medicaments);
				Dosage dosage = new Dosage();
				model.addAttribute("dosage", dosage);
				return "new_dosage";
		
		
		
		
	}
	
	

}
