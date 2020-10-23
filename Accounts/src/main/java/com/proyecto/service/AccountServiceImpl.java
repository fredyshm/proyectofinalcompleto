package com.proyecto.service;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dto.response.AccountResponse;
import com.proyecto.entity.Account;

@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public AccountResponse getAccountResponse(String cardnumber) {
		List<Account> listaccount= asList(
				new Account(21,"1111222233334441","1111222233334441",1500),
				new Account(22,"1111222233334442","1111222233334442",1500),
				new Account(23,"1111222233334443","1111222233334443",1500),
				new Account(24,"1111222233334444","1111222233334444",1500));
		return listaccount.stream().filter(account -> account.getCardnumber() 
				.equals(cardnumber))
				.findFirst()
				.map(account -> AccountResponse.builder()
						.accountnumber(account.getAccountnumber().concat("XXX"))
						.amount(account.getAmount()).build()).orElse(null);
	}
}
