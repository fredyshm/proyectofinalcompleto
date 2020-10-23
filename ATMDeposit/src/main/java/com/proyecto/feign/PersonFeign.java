package com.proyecto.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.response.PersonResponse;

@FeignClient(name="servicio-persons", url="localhost:8010/core/persons")
public interface PersonFeign {
	
//	@GetMapping("/all")
//	public List<Person> listar();
	
	@GetMapping
	public PersonResponse detalleDoc(@RequestParam("documentNumber") String documentNumber);

}
