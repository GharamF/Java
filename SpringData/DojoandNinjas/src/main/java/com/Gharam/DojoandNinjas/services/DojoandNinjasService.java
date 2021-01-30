package com.Gharam.DojoandNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Gharam.DojoandNinjas.models.Dojo;
import com.Gharam.DojoandNinjas.models.Ninja;
import com.Gharam.DojoandNinjas.repositories.DojoRepository;
import com.Gharam.DojoandNinjas.repositories.NinjaRepository;

@Service
public class DojoandNinjasService {

	private final DojoRepository DojoRepo;
	private final NinjaRepository NinjaRepo;
	
	public DojoandNinjasService (DojoRepository DojoRepo,
			NinjaRepository NinjaRepo	) {
	this.DojoRepo=DojoRepo;
	this.NinjaRepo=NinjaRepo;
	}
	
	public void CreateDojo(Dojo dojo) {
		DojoRepo.save(dojo);
	}
	public void AddNinja(Ninja ninja) {
		NinjaRepo.save(ninja);
	}
	
	public List<Dojo> GetAllDojos() {
		return DojoRepo.findAll();
	}
	
	public Dojo FindDojo(Long id) {
		Optional<Dojo> dojo = DojoRepo.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		}
		else {
			return null;
		}
	}
	
	
}
