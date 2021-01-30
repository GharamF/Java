package com.Gharam.Languages.services;
import com.Gharam.Languages.models.Language;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.Gharam.Languages.repositories.LanguageRepository;
@Service
public class LanguageService {
	
	private final LanguageRepository repo;
	
	public LanguageService(LanguageRepository repo) {
		this.repo =repo;
	}
	
	public List<Language> allLanguages(){
		return repo.findAll();
	}
	public Language findaLanguage(Long id) {
		Optional<Language> OptionalLanguage = repo.findById(id);
		if (OptionalLanguage.isPresent()) {
			return OptionalLanguage.get();
		}
		else {
			return null;
		}
	}
	public Language Create(Language Lang) {
		return repo.save(Lang);
	}


	
	public void deleteLanguage(Long id) {
		if (repo.findById(id).isPresent()) {
			repo.deleteById(id);
		    }
	}
	

	  public Language updateLanguage(Long id, String name, String creator,Double currentVersion ) {
	    if (repo.findById(id).isPresent()) {
	   	  Language Language = repo.findById(id).get();
	   	  Language.setName(name);
	   	  Language.setCreator(creator);
	   	Language.setCurrentVersion(currentVersion);
	      return repo.save(Language);
	    }
	    else {
	    return null;
	    }
	}

	  public Language updateLanguage(Language Language) {
	    return this.updateLanguage(Language.getId(),Language.getName() , Language.getCreator(),Language.getCurrentVersion());
	  }
}
