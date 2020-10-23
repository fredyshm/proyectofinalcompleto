package com.proyecto.service;

import com.proyecto.dto.response.FingerprintResponse;

public interface FingerprintService{
	
	public FingerprintResponse getFingerprintResponse(String document);
}
