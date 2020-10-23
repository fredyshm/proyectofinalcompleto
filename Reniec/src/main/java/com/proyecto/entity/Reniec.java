package com.proyecto.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Reniec {

	private Integer id;
	private String entityname;
	private String document;
//	private boolean succes;
}
