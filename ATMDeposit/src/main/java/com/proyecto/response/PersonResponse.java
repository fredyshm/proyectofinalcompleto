package com.proyecto.response;

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
public class PersonResponse {

	private Integer id;
//	private String document;
	private Boolean fingerprint;
	private Boolean blacklist;
}
