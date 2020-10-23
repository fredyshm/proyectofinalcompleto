package com.proyecto.service;

import static java.util.Arrays.asList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.dto.response.FingerprintResponse;
import com.proyecto.entity.Fingerprint;

@Service
public class FingerprintServiceImpl implements FingerprintService{

	@Override
	public FingerprintResponse getFingerprintResponse(String document) {
		
		List<Fingerprint> listafingerprint=asList(
				new Fingerprint(12,"Fingerprint","12345678"),
				new Fingerprint(13,"Fingerprint","70402585"));
				
		return listafingerprint.stream().filter(fingerprint -> fingerprint.getDocument()
				.equals(document))
				.findFirst()
				.map(Fingerprint -> FingerprintResponse.builder()
						.entityname(Fingerprint.getEntityname())
						.succes(true).build()).orElse(null);
	}
}

