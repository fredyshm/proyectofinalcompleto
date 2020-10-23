package com.proyecto.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Person;
import com.proyecto.service.PersonService;

@RestController
@RequestMapping("/core/persons")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/all")
	public List<Person> listar(){
		return personService.findAllPerson();
	}
	
	@GetMapping
	public Person detalleDoc(@RequestParam("documentNumber") String documentNumber) {
		return personService.findPersonByDocument(documentNumber);
	}
}
