package com.xworkz.googleapiintegeration.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import com.xworkz.googleapiintegeration.configuration.CustomFeignClientConfig;
import com.xworkz.googleapiintegeration.dto.SoftwareDto;
import com.xworkz.googleapiintegeration.dto.batches.BatchDto;
import com.xworkz.googleapiintegeration.dto.batches.BatchDtoBtm;
import com.xworkz.googleapiintegeration.dto.faculties.FacultiesDto;
import com.xworkz.googleapiintegeration.dto.reviews.ReviewsDto;



@FeignClient(name = "website-client" , url = "https://raw.githubusercontent.com/", configuration = CustomFeignClientConfig.class)
public interface WesbiteService {
	
	@GetMapping(value = "xworkzodc/JSON/master/SoftwareLinks.json",  consumes = MediaType.TEXT_PLAIN_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
	SoftwareDto getSoftwareLink();
	
	@GetMapping(value = "/xworkzodc/JSON/master/Batches.json" , consumes = MediaType.TEXT_PLAIN_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
	BatchDto getBatches();
	
	@GetMapping(value = "/xworkzodc/JSON/master/Batches-BTM.json" , consumes = MediaType.TEXT_PLAIN_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
	BatchDtoBtm getBatchesBTM();
	
	
	@GetMapping(value = "/xworkzodc/JSON/master/Faculties.json" , consumes = MediaType.TEXT_PLAIN_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
	FacultiesDto getFaculties();
	
	
	@GetMapping(value = "/xworkzodc/JSON/master/Reviews.json" , consumes = MediaType.TEXT_PLAIN_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
	ReviewsDto getReviews();

	
}
