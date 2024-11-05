package com.xworkz.googleapiintegeration.dto.batches;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xworkz.googleapiintegeration.dto.SoftwareDto;
import com.xworkz.googleapiintegeration.dto.Softwares;

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
public class BatchProperties {
	
	@JsonProperty("courseName")
	private String courseName;
	@JsonProperty("startDate")
	private String startDate;
	@JsonProperty("time")
	private String time;
	@JsonProperty("type")
	private String type;
	@JsonProperty("facultyName")
	private String facultyName;
	@JsonProperty("placed")
	private Integer placed;

}
