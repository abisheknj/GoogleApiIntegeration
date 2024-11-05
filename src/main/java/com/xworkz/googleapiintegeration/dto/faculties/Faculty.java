package com.xworkz.googleapiintegeration.dto.faculties;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "description", "imgSrc" })
public class Faculty {

	@JsonProperty("name")
	public String name;
	@JsonProperty("designation")
	public String designation;
	@JsonProperty("description")
	public String description;
	@JsonProperty("imgSrc")
	public String imgSrc;

}
