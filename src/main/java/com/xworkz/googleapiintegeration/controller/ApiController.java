package com.xworkz.googleapiintegeration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.googleapiintegeration.dto.SoftwareDto;
import com.xworkz.googleapiintegeration.dto.batches.BatchDto;
import com.xworkz.googleapiintegeration.dto.batches.BatchDtoBtm;
import com.xworkz.googleapiintegeration.dto.faculties.FacultiesDto;
import com.xworkz.googleapiintegeration.dto.reviews.ReviewsDto;
import com.xworkz.googleapiintegeration.service.WesbiteService;

@RestController
public class ApiController {
	
	@Autowired
	private WesbiteService service;
	
	@GetMapping("/getSoftwareLinkData")
	public SoftwareDto getSoftwareLinkData() {
		SoftwareDto response = service.getSoftwareLink();
		
		return response;
	}
	
	@GetMapping("/getBatches")
	public BatchDto getBatches() {
		BatchDto response = service.getBatches();
		
		return response;
	}
	@GetMapping("/getBatchesBTM")
	public BatchDtoBtm getBatchesBTM() {
		BatchDtoBtm response = service.getBatchesBTM();
		
		return response;
	}
	
	@GetMapping("/getFaculties")
	public FacultiesDto getFaculties() {
		
		FacultiesDto response = service.getFaculties();
		return response;
	}
	
	@GetMapping("/getReviews")
	public ReviewsDto getReviews() {
		
		ReviewsDto response = service.getReviews();
		return response;
	}
	
	

}
