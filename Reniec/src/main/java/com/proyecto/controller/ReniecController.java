package com.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.dto.request.ReniecRequest;
import com.proyecto.dto.response.ReniecResponse;
import com.proyecto.service.ReniecService;

@RestController
@RequestMapping("/external/reniec")
public class ReniecController {

	@Autowired
	private ReniecService reniecService;
	
	@PostMapping("/validate")//insertar datos
	@ResponseBody
	public ReniecResponse ValidarReniec(@RequestBody ReniecRequest request) {
	return reniecService.getReniecResponse(request.getDocument());
	}
}
