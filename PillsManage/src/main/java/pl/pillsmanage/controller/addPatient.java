package pl.pillsmanage.controller;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.pillsmanage.dto.PatientNameDTO;
import pl.pillsmanage.entity.Patients;
import pl.pillsmanage.repository.PatientsRepository;

@Controller
public class addPatient {
	@Autowired
	private PatientsRepository patientsRepository;
	
	@RequestMapping(value = "/addPatient", method = RequestMethod.GET)
	public String addPatient (Model model, HttpSession ses)	{
		
		PatientNameDTO patientNameDTO = new PatientNameDTO();
		model.addAttribute("patientNameDTO", patientNameDTO);
		ses.setAttribute("patientNameDTO", patientNameDTO);
		return "add_patient";
		
	}
	
	@RequestMapping(value = "/addPatient", method = RequestMethod.POST)
	public String formSended(Model model, HttpSession ses, @Valid PatientNameDTO patientNameDTO, BindingResult result) {
		//jeżeli są błędy walidacji formularza wyświetlmy go ponownie
		if	(result.hasErrors())	{
			return	"add_patient";
}
		
		
		//szukam w zapisanych wcześniej w bazie pacjentach, czy nie ma już pacjenta o tej samej nazwie
		int found=patientsRepository.countByName(patientNameDTO.getName());
		
		//jeżelii jest chcę przekierować ponownie do strony wpisywania pacjenta, z odpowiednią informacją
		
		if(found>0) {
			patientNameDTO.setDoubledName(1);
			return "add_patient";
		}
		
		
		//jeżeli nie ma, przechodzimy dalej
		
		
		return "add2";
		
	}
	

}
