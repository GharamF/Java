package com.Gharam.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Gharam.relationships.Repository.PersonRepository;
import com.Gharam.relationships.models.Person;


@Service
public class PersonService {

	private final PersonRepository PersonRepository;
	
	public PersonService(PersonRepository PersonRepository) {
		this.PersonRepository=PersonRepository;
	}
	public List<Person> AllPeople() {
		return PersonRepository.findAll();
	}
	
	public Person CreatePerson(Person person) {
		return PersonRepository.save(person);
	}
	public List<Person> getUnlicensedPeople() {
		return PersonRepository.findByLicenseIdIsNull();
	}
	public Person getPerson(Long id) {
		Optional<Person> person = PersonRepository.findById(id);
		return person.get();
	}
	
}
