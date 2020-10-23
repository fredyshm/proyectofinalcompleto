package com.proyecto.proxy;

import com.proyecto.request.CardRequest;
import com.proyecto.response.CardResponse;

public interface CardProxy {
	
	public CardResponse obtenerCard(CardRequest request);

}
