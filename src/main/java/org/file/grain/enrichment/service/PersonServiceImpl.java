package org.file.grain.enrichment.service;

import javax.persistence.EntityNotFoundException;

import org.file.grain.enrichment.annotation.CustomAnnotation;
import org.file.grain.enrichment.model.Person;
import org.file.grain.enrichment.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Person addPersonne(Person person) {

		return personRepository.save(person);
	}

	
	@CustomAnnotation
	@Override
	public Person findPersonById(Long idPerson) {

		return personRepository.findById(idPerson)
				.orElseThrow(() -> new EntityNotFoundException("Person not found with id: " + idPerson));

	}

}
