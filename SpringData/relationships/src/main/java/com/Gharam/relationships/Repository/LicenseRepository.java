package com.Gharam.relationships.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Gharam.relationships.models.License;

@Repository 
public interface LicenseRepository extends CrudRepository<License, Long>{

	public List<License> findAll();
	public License findTopByOrderByNumberDesc();

}

