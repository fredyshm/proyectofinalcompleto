package com.proyecto.service;

import java.util.List;

import com.proyecto.dto.response.AccountResponse;
import com.proyecto.entity.Account;

public interface AccountService {
	
	public AccountResponse getAccountResponse(String cardnumber);
	
}
