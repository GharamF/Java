package com.Gharam.DojoandNinjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Gharam.DojoandNinjas.models.Ninja;


@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {

}
