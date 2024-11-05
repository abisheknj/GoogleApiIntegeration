package com.xworkz.googleapiintegeration.dto.faculties;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FacultiesDto {
	
	@JsonProperty("Faculties")
	public List<Faculty> faculties;

	}


