package com.proyecto.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.proyecto.request.ValidarRequest;
import com.proyecto.response.ValidarResponse;

@FeignClient(name="servicio-fingerprints", url="localhost:8015/external/fingerprint")
public interface FingerprintFeign {

	@PostMapping("/validate")		//para insertar los datos
	@ResponseBody
	public ValidarResponse ValidarFingerprint(@RequestBody ValidarRequest request);
}
