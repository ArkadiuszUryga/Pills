package pl.pillsmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller



public class HomeController {
	@RequestMapping({"/homepage", "/home", "/index", "/" })
	public String body(Model model)	{
		return "index";
		
	}
}
