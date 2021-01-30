package com.Gharam.relationships.Controller;
import com.Gharam.relationships.services.*;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.Gharam.relationships.models.License;
import com.Gharam.relationships.models.Person;

@Controller
public class mainController {
	private final LicenseService LicenseService;
	private final PersonService PersonService;
	
	public mainController (LicenseService LicenseService,PersonService PersonService) {
		this.LicenseService=LicenseService;
		this.PersonService=PersonService;
	}
	@RequestMapping("/")
	public String Index(Model model) {
		List<Person> people = PersonService.AllPeople();
		model.addAttribute("persons", people);
		return "index.jsp";
	}
	@RequestMapping("/new")
	public String AddnewPerson(@ModelAttribute("person") Person person) {
		return "NewPerson.jsp";
	}
	
	@RequestMapping(value="/licenses/new",method = RequestMethod.GET)
	public String AddnewLicense(@ModelAttribute("license") License License , Model model) {
		List<Person> persons = PersonService.getUnlicensedPeople();
		model.addAttribute("persons", persons);
		model.addAttribute("License",License);
		return "NewLicense.jsp";
	}
	
	

	@RequestMapping(value="/", method=RequestMethod.POST)
	public String CreatePerson(@Valid @ModelAttribute("person") Person person,BindingResult result ) {
		if(result.hasErrors() ) {
			return "NewPerson.jsp";
		}
		PersonService.CreatePerson(person);
		return "redirect:/";
	}

	@RequestMapping(value="/licenses",method = RequestMethod.POST)
	public String CreateLicense(@Valid @ModelAttribute("License") License License,  BindingResult result) {
		if(result.hasErrors() ) {
			return "NewLicense.jsp";
		}
		LicenseService.addLicense(License);
		return "redirect:/";
	}
	
	
	

}
