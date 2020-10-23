package com.proyecto.proxy;

import com.proyecto.request.ValidarRequest;
import com.proyecto.response.ValidarResponse;

public interface ReniecProxy {

	public ValidarResponse obtenerinfoReniec(ValidarRequest request);
}
