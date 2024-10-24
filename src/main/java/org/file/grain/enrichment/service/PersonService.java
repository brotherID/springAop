package org.file.grain.enrichment.service;

import org.file.grain.enrichment.model.Person;

public interface PersonService {

	Person addPersonne(Person person);

	Person findPersonById(Long idPerson);

}
