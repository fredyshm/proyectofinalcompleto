package com.proyecto.service;

import static java.util.Arrays.asList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.proyecto.dto.response.ReniecResponse;
import com.proyecto.entity.Reniec;

@Service
public class ReniecSeriviceImpl implements ReniecService{

	@Override
	public ReniecResponse getReniecResponse(String document) {
		List<Reniec> listreniec= asList(
		        new Reniec(10, "Reniec", "87654321"),
		        new Reniec(11, "Reniec", "10502578"));
		     
		return listreniec.stream().filter(reniec -> reniec.getDocument()
				.equals(document))
				.findFirst()
				.map(reniec -> ReniecResponse.builder()
						.entityname(reniec.getEntityname())
						.succes(true).build()).orElse(null);
	}
}
