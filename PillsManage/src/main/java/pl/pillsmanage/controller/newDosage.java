package pl.pillsmanage.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.pillsmanage.entity.Dosage;
import pl.pillsmanage.entity.Medicaments;
import pl.pillsmanage.entity.Patients;
import pl.pillsmanage.repository.DoageRepository;
import pl.pillsmanage.repository.MedicamentRepository;

@Controller
public class newDosage {
	
	@Autowired
	private MedicamentRepository medicamentRepository;
	private DoageRepository dosageRepository;
	
	@ModelAttribute("numberList")
	public Collection<Integer> numberList(){
		
		List<Integer>numberList = new ArrayList<>();
		numberList.add(0);
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		return numberList;
		
	}

	@RequestMapping(value="/newDosage", method=RequestMethod.GET)
	public String newDosageGet (Model model, HttpSession ses) {
		
		Dosage dosage = new Dosage();
		List<Medicaments> listOfMedicaments=medicamentRepository.findAll(); //finds all medicines from the maedicamnets table, 
		//to display them in a drop-down list view
		
		model.addAttribute("dosage", dosage);
		model.addAttribute("listOfMedicaments", listOfMedicaments);
		
		return "new_dosage";

	}
	
	@RequestMapping(value="/newDosage", method=RequestMethod.POST)

	public String newDosagePost (Model model, HttpSession ses, @ModelAttribute Dosage dosage, @ModelAttribute Patients patients)  {
		
		dosageRepository.save(dosage);
		return "dosage_aded";
	}
} 
