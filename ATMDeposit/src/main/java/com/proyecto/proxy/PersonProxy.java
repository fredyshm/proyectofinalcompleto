package com.proyecto.proxy;

import com.proyecto.request.PersonRequest;
import com.proyecto.response.PersonResponse;

public interface PersonProxy {

	public PersonResponse obtenerPerson(PersonRequest request);
}
