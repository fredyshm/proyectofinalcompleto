package com.proyecto.dto.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FingerprintRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	private String document;
}
