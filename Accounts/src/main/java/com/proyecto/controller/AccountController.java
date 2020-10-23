package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.dto.response.AccountResponse;
import com.proyecto.service.AccountService;

@RestController
@RequestMapping("core/accounts")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping
	public AccountResponse detalleCuenta(@RequestParam("cardNumber") String cardNumber) {
		return accountService.getAccountResponse(cardNumber);
	}
}
