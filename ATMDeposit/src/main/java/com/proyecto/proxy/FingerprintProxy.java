package com.proyecto.proxy;

import com.proyecto.request.ValidarRequest;
import com.proyecto.response.ValidarResponse;

public interface FingerprintProxy {

	public ValidarResponse obtenerinfoFingerprint(ValidarRequest request);
}
