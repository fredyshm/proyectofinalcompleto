package com.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.dto.request.ATMDepositRequest;
import com.proyecto.dto.response.ATMDepositResponse;
import com.proyecto.service.ATMDepositService;

@RestController
@RequestMapping("/atm")
public class ATMDepositController {

	@Autowired
	private ATMDepositService atmdepositservice;
	
	@PostMapping("/deposit")
	@ResponseBody
	public ATMDepositResponse informacion(@RequestBody ATMDepositRequest request) {
		return atmdepositservice.getInformation(request);
	}
}
