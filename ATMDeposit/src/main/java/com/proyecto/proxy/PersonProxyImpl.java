package com.proyecto.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.feign.PersonFeign;
import com.proyecto.request.PersonRequest;
import com.proyecto.response.PersonResponse;

@Component
public class PersonProxyImpl implements PersonProxy {

	@Autowired
	PersonFeign personfeign;
	
	@Override
	public PersonResponse obtenerPerson(PersonRequest request ) {
		return personfeign.detalleDoc(request.getDocument());
	}
}
