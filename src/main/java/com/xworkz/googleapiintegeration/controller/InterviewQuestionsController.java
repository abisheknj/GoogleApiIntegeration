package com.xworkz.googleapiintegeration.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.googleapiintegeration.dto.interviewquestions.InterviewQuestionsDto;
import com.xworkz.googleapiintegeration.dto.interviewquestions.InterviewQuestionsTree;
import com.xworkz.googleapiintegeration.service.InterviewQuestionService;

@RestController
public class InterviewQuestionsController {
	
	@Autowired
	private InterviewQuestionService service;
	
	@GetMapping("/getCoreJavaQuestions")
	public InterviewQuestionsDto getCoreJavaQuestions() {
		return service.getCoreJavaQuestions();
	}
	
	@GetMapping("/getMySqlQuestions")
	public InterviewQuestionsDto getMySqlQuestions() {
		return service.getMySqlQuestions();
	}
	
	
	@GetMapping("/getAdvancedJavaQuestions")
	public InterviewQuestionsDto getAdvancedJavaQuestions() {
		return service.getAdvancedJavaQuestions();
	}
	
	@GetMapping("/getSpringQuestions")
	public InterviewQuestionsDto getSpringQuestions(){
		return service.getSpringQuestions();
	}
	
	@GetMapping("/getInterviewQuestionsTree")
	public InterviewQuestionsTree getInterviewQuestionsTree(){
		return service.getInterviewQuestionsTree();
	}
	
	
	

}
