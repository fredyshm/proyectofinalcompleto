package com.proyecto.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.dto.request.ATMDepositRequest;
import com.proyecto.dto.response.ATMDepositResponse;
import com.proyecto.proxy.AccountProxy;
import com.proyecto.proxy.CardProxy;
import com.proyecto.proxy.FingerprintProxy;
import com.proyecto.proxy.PersonProxy;
import com.proyecto.proxy.ReniecProxy;
import com.proyecto.request.AccountRequest;
import com.proyecto.request.CardRequest;
import com.proyecto.request.PersonRequest;
import com.proyecto.request.ValidarRequest;
import com.proyecto.response.AccountResponse;
import com.proyecto.response.CardResponse;
import com.proyecto.response.PersonResponse;
import com.proyecto.response.ValidarResponse;

@Service
public class ATMDepositServiceImpl implements ATMDepositService{
	
	@Autowired
	ReniecProxy reniecproxy;
	
	@Autowired
	PersonProxy personproxy;
	
	@Autowired
	FingerprintProxy fingerprintproxy;
	
	@Autowired
	CardProxy cardproxy;
	
	@Autowired 
	AccountProxy accountproxy;
	
	@Override
	public ATMDepositResponse getInformation(ATMDepositRequest atmrequest) {
		
		PersonRequest personRequest = PersonRequest.builder().document(atmrequest.getDocument()).build();
		PersonResponse personResponse = personproxy.obtenerPerson(personRequest); 
		
		ValidarRequest validarRequest = ValidarRequest.builder().document(atmrequest.getDocument()).build();
		ValidarResponse validarResponse = new ValidarResponse();
		
		CardRequest cardRequest = CardRequest.builder().document(atmrequest.getDocument()).build();
		CardResponse cardResponse = cardproxy.obtenerCard(cardRequest);
		
		AccountRequest accountRequest = AccountRequest.builder().cardnumber(atmrequest.getDocument()).build();
		AccountResponse accountResponse = accountproxy.obtenerCuenta(accountRequest);
		
		if(personResponse.getFingerprint()) {
			validarResponse = fingerprintproxy.obtenerinfoFingerprint(validarRequest);
		}else {
			validarResponse = reniecproxy.obtenerinfoReniec(validarRequest);
		}
		
		ATMDepositResponse atmDepositResponse = ATMDepositResponse.builder().fingerprintEntityName(validarResponse.getEntityname())
//				.validAccount(null)
//				.customerAccount(cardResponse -> accountRequest.
//				.customerAccount(atmrequest.am)
//				.validAccount(atmrequest.getDocument())
				.build();
		
		return  atmDepositResponse;
	} 
}
