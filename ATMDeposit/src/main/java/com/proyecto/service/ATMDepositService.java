package com.proyecto.service;

import com.proyecto.dto.request.ATMDepositRequest;
import com.proyecto.dto.response.ATMDepositResponse;

public interface ATMDepositService {
	
	public ATMDepositResponse getInformation(ATMDepositRequest request);
}
