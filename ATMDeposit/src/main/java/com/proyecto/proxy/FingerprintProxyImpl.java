package com.proyecto.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.feign.FingerprintFeign;
import com.proyecto.request.ValidarRequest;
import com.proyecto.response.ValidarResponse;

@Component
public class FingerprintProxyImpl implements FingerprintProxy{

	@Autowired
	FingerprintFeign fingerprintfeign;
	
	@Override
	public ValidarResponse obtenerinfoFingerprint(ValidarRequest request) {
		return fingerprintfeign.ValidarFingerprint(request);
	}
}
