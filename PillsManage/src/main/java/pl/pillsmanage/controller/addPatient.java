package pl.pillsmanage.controller;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.pillsmanage.entity.Patients;
import pl.pillsmanage.repository.PatientsRepository;

@Controller
public class addPatient {
	@Autowired
	private PatientsRepository patientsRepository;
	
	@RequestMapping(value = "/addPatient", method = RequestMethod.GET)
	public String addPatient (Model model, HttpSession ses)	{
		
		Patients patients = new Patients();
		model.addAttribute("patients", patients);
		ses.setAttribute("patients", patients);
		return "add_patient";
		
	}
	
	@RequestMapping(value = "/addPatient", method = RequestMethod.POST)
	public String formSended(@ModelAttribute Patients patients, Model model, HttpSession ses) {
		
		//szukam w zapisanych wcześniej w bazie pacjentach, czy nie ma już pacjenta o tej samej nazwie
		int found=patientsRepository.countByName(patients.getName());
		
		//jeżelii jest chcę przekierować ponownie do strony wpisywania pacjenta, z odpowiednią informacją
		
		if(found>0) {
			patients.setDoubledName(1);
			return "add_patient";
		}
		
		
		//jeżeli nie ma, zapisujemy pacjenta w bazie
		patientsRepository.save(patients);
		//usuwam z sesji starego pacjenta (może ktoś wpisywał dwóch lub więcej na raz) i wstawiam nowego.
		
		return "add2";
		
	}
	

}
