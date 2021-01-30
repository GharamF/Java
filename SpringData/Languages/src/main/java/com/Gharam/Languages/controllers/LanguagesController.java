package com.Gharam.Languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Gharam.Languages.models.Language;
import com.Gharam.Languages.services.LanguageService;


@Controller 
public class LanguagesController {
	private final LanguageService languagesService;
	
	public LanguagesController(LanguageService languagesService) {
		this.languagesService=languagesService;
	}
	
	
	
	@RequestMapping ("/Languages")
	public String index(Model model) {
		List<Language> Languages = languagesService.allLanguages();
		model.addAttribute("Languages",Languages);
		return "index.jsp";
	}
	
	@RequestMapping ("/Languages/{id}/edit")
	public String Edit(@PathVariable("id") Long id,Model model) {
		Language language= languagesService.findaLanguage(id);
		model.addAttribute("Language",language);
		return "Edit.jsp";
	}
	
	
	@RequestMapping ("/Languages/{id}")
	public String View(@PathVariable("id") Long id,Model model) {
		Language language= languagesService.findaLanguage(id);
		model.addAttribute("Language",language);
		return "View.jsp";
	}
	
	
	@RequestMapping("/Languages/new")
	public String newBook(@ModelAttribute("Language") Language Language) {
	        return "new.jsp";
	    }
	@RequestMapping(value="/Languages", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("Language") Language Language, BindingResult result) {
	        if (result.hasErrors()) {
	            return "new.jsp";
	        } else {
	        	languagesService.Create(Language);
	            return "redirect:/Languages";
	        }
	    }

	@RequestMapping(value = "/languages/{id}", method = RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("Language") Language Language, BindingResult result) {;
      if (result.hasErrors()) {
        return "redirect:/Languages/{id}/edit";
      } else {
    	  languagesService.updateLanguage(Language);
        return "redirect:/Languages";
      }
    }

	 @RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
	    public String Delete(@PathVariable("id") Long id) {
		 languagesService.deleteLanguage(id);
	        return "redirect:/Languages";
	    }
	
	
	    
	    
	
	
}
