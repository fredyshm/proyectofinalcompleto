package com.proyecto.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.feign.CardsFeign;
import com.proyecto.request.CardRequest;
import com.proyecto.response.CardResponse;

@Component
public class CardProxyImpl implements CardProxy{

	@Autowired
	private CardsFeign cardFeign;
	
	@Override
	public CardResponse obtenerCard(CardRequest request) {
		return cardFeign.detalleCard(request.getDocument());
	}

}
