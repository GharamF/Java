package com.Gharam.Languages.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Gharam.Languages.services.LanguageService;
import com.Gharam.Languages.models.Language;


@RestController 
public class LanguagesApi {
	
	private final LanguageService LanguageService;
	
	
	public LanguagesApi(LanguageService LanguageService) {
	this.LanguageService=LanguageService;
	}

    @RequestMapping("/api/Languages")
    public List<Language> index() {
        return LanguageService.allLanguages();
    }
    
    @RequestMapping(value="/api/Languages", method=RequestMethod.POST)
    public Language create(@RequestParam(value="Name") String Name, @RequestParam(value="creator") String creator,
    		@RequestParam(value="currentVersion") Double currentVersion) {
    	Language language = new Language(Name , creator , currentVersion);
        return LanguageService.Create(language);
    }
    
    @RequestMapping("/api/Languages/{id}")
    public Language show(@PathVariable("id") Long id) {
    	Language language = LanguageService.findaLanguage(id);
        return language;
    }
    
    
}
