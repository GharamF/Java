package com.Gharam.DojoandNinjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Gharam.DojoandNinjas.models.Dojo;
import com.Gharam.DojoandNinjas.models.Ninja;
import com.Gharam.DojoandNinjas.services.DojoandNinjasService;

@Controller
public class HomeController {
	private final DojoandNinjasService Service;
	
	public HomeController(DojoandNinjasService Service) {
		this.Service=Service ;
	}
	
	@RequestMapping("/NewDojo")
	public String NewDojo(@ModelAttribute("Dojo") Dojo dojo){
		return "NewDojo.jsp";
	}
	
	@RequestMapping(value="/AddDojo", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("Dojo") Dojo Dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "NewDojo.jsp";
        } else {
        	Service.CreateDojo(Dojo);
            return "redirect:/NewNinja";
        }
    }
	
	@RequestMapping("/NewNinja")
	public String NewNinja(@ModelAttribute("Ninja") Ninja Ninja,Model model){
		model.addAttribute("dojos", Service.GetAllDojos());
		return "NewNinja.jsp";
	
	}
	@RequestMapping(value="/AddNinja", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("Ninja") Ninja Ninja, BindingResult result) {
        if (result.hasErrors()) {
            return "NewDojo.jsp";
        } else {
        	Service.AddNinja(Ninja);
            return "redirect:/Dojos/"+Ninja.getDojo().getId();
        }
    }

	@RequestMapping("/Dojos/{DojoID}")
	public String ViewDojo(@PathVariable("DojoID") long id , Model model) {
		Dojo dojo = Service.FindDojo(id);
		model.addAttribute("dojo",dojo);
		return "DojoPage.jsp";
	}
	
	
}
