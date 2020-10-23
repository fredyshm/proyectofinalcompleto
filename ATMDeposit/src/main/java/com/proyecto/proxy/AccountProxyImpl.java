package com.proyecto.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.feign.AccountFeign;
import com.proyecto.request.AccountRequest;
import com.proyecto.response.AccountResponse;

@Component
public class AccountProxyImpl implements AccountProxy{
	
	@Autowired
	private AccountFeign accountfeign;

	@Override
	public AccountResponse obtenerCuenta(AccountRequest request) {
		
		return accountfeign.detalleCuenta(request.getCardnumber());
	}
}
