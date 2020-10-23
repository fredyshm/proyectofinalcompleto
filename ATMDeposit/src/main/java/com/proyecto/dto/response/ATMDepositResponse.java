package com.proyecto.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ATMDepositResponse {

	private String fingerprintEntityName;
	private List<ValidAccount> validAccount;
	//private String validAccount;
	private Integer customerAccount;
	
}
