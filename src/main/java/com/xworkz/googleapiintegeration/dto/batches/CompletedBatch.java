package com.xworkz.googleapiintegeration.dto.batches;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"courseName",
"startDate",
"time",
"type",
"facultyName",
"placed"
})public class CompletedBatch extends BatchProperties{
	
	

}
