package com.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.dto.request.FingerprintRequest;
import com.proyecto.dto.response.FingerprintResponse;
import com.proyecto.service.FingerprintService;

@RestController
@RequestMapping("/external/fingerprint")
public class FingerprintController {

	@Autowired
	private FingerprintService fingerprintService;
	
	@PostMapping("/validate")		//para insertar los datos
	@ResponseBody
	public FingerprintResponse ValidarFingerprint(@RequestBody FingerprintRequest request) {
		return fingerprintService.getFingerprintResponse(request.getDocument());
	}
	
	
}
