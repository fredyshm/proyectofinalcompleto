package com.proyecto.service;

import java.util.List;
import com.proyecto.entity.Person;

public interface PersonService {
	
	public List<Person> findAllPerson();
//	public Person findById(Long id);
	public Person findPersonByDocument(String document);
}
