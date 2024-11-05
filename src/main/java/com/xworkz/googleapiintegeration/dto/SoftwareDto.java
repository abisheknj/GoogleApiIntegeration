package com.xworkz.googleapiintegeration.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoftwareDto {
	
	
	@JsonProperty("Softwares")
	private Softwares[] softwares;
	

	
	

	}
