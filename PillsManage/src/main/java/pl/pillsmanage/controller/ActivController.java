package pl.pillsmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ActivController {

	
	@RequestMapping(value = "/activ")
	
	public String admin(Model model)	{
		return "activity";
		
	}
}
