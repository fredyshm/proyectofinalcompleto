package com.proyecto.proxy;

import com.proyecto.request.AccountRequest;
import com.proyecto.response.AccountResponse;

public interface AccountProxy {

	public AccountResponse obtenerCuenta(AccountRequest request);
	
}
