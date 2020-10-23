package com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.entity.Person;

@Repository
@Transactional
public interface PersonRepository extends JpaRepository<Person, Integer>{//atributos mediante la clase

	public Person findByDocument(String document);
}
