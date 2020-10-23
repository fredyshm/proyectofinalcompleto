package com.proyecto.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.feign.ReniecFeign;
import com.proyecto.request.ValidarRequest;
import com.proyecto.response.ValidarResponse;

@Component
public class ReniecProxyImpl implements ReniecProxy{

	@Autowired
	ReniecFeign reniecfeign;
	
	@Override
	public ValidarResponse obtenerinfoReniec(ValidarRequest request) {
		return reniecfeign.ValidarReniec(request);
	}
}
