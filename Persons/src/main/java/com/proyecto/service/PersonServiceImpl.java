package com.proyecto.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.entity.Person;
import com.proyecto.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepoitory;

	@Override
	public List<Person> findAllPerson() {
		return personRepoitory.findAll();
	}

	@Override
	public Person findPersonByDocument(String document) {
		
		return personRepoitory.findAll()
				.stream()	//para manejar listas
				.filter(person -> person.getDocument()
				.equals(document))
				.findFirst() //para obtener el primer resultado
				.get();//obtener un objeto persona
	}
}