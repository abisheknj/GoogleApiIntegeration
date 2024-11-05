package com.xworkz.googleapiintegeration.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Data
@Getter
@Setter
public class Softwares {
	
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "description")
	private String description;
	@JsonProperty(value = "directLink")
	private String directLink;
	@JsonProperty(value = "extranalLink")
	private String extranalLink;
	
	
}