package com.proyecto.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.proyecto.request.ValidarRequest;
import com.proyecto.response.ValidarResponse;

@FeignClient(name="servicio-reniec", url="localhost:8014/external/reniec")
public interface ReniecFeign {

	@PostMapping("/validate")//insertar datos
	@ResponseBody
	public ValidarResponse ValidarReniec(@RequestBody ValidarRequest request);
}
