package com.proyecto.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.response.CardResponse;

@FeignClient(name="servicio-cards", url="localhost:8016/core/cards")
public interface CardsFeign {
	
	@GetMapping
	public CardResponse detalleCard(@RequestParam("documentNumber") String documentNumber);

}
