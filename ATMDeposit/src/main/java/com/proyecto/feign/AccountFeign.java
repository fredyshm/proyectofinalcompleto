package com.proyecto.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.response.AccountResponse;

@FeignClient(name="servicio-accounts", url="localhost:8013/core/accounts")
public interface AccountFeign {
	
	@GetMapping
	public AccountResponse detalleCuenta(@RequestParam("cardNumber") String cardNumber);

	
}
