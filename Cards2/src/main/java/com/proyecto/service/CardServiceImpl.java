package com.proyecto.service;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.proyecto.dto.response.CardResponse;
import com.proyecto.dto.response.ListCardResponse;
import com.proyecto.entity.Card;

@Service
//@AllArgsConstructor
public class CardServiceImpl implements CardService{

	@Override
	public ListCardResponse getCardResponse(String document) {
		
		List<Card> listacards = asList(
				new Card(15,"1111222233334441","70402585",true),
				new Card(16,"1111222233334442","74123698",true),
				new Card(17,"1111222233334443","12345678",false),
				new Card(18,"1111222233334444","12345677",false));
		
		List<CardResponse> listcardsresponse = listacards.stream().filter(card -> card.getDocument()
				.equals(document))
				.map(card -> CardResponse.builder()
						.cardnumber(card.getCardnumber())
						.active(card.isActive()).build()).collect(Collectors.toList());
		return ListCardResponse.builder().cards(listcardsresponse).build();
	}
}
	