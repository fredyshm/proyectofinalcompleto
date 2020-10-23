package com.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.dto.response.ListCardResponse;
import com.proyecto.service.CardService;

@RestController
@RequestMapping("/core/cards")
public class CardController {

	@Autowired
	private CardService cardService;
	
	@GetMapping
	public ListCardResponse obtenerCard(@RequestParam("documentNumber") String documentNumber) {
		return cardService.getCardResponse(documentNumber);
	}
}
