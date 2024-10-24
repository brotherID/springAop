package org.file.grain.enrichment.api;

import org.file.grain.enrichment.model.Person;
import org.file.grain.enrichment.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class PersonController {

	private PersonService personService;

	@PostMapping(path = "/add/personne")
	public Person savePerson(@RequestBody Person person) {

		return personService.addPersonne(person);

	}

	@GetMapping(path = "/get/personne")
	public Person findById(@RequestParam(value = "idPersonne") Long idPersonne) {

		return personService.findPersonById(idPersonne);
	}

}
