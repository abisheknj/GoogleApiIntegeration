package com.xworkz.googleapiintegeration.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.xworkz.googleapiintegeration.configuration.CustomFeignClientConfig;
import com.xworkz.googleapiintegeration.dto.interviewquestions.InterviewQuestionsDto;
import com.xworkz.googleapiintegeration.dto.interviewquestions.InterviewQuestionsTree;


@FeignClient(name = "interview-questions" , url = "https://raw.githubusercontent.com/", configuration = CustomFeignClientConfig.class)
public interface InterviewQuestionService {
	
	@GetMapping(value = "X-workzDev01/JSON/master/Interview-Questions-Updated/InterviewQuestionsTree.json" ,  
			consumes = MediaType.TEXT_PLAIN_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
	public InterviewQuestionsTree getInterviewQuestionsTree();
	
	
	@GetMapping(value = "X-workzDev01/JSON/master/Interview-Questions-Updated/Core-Java.json" ,  
			consumes = MediaType.TEXT_PLAIN_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
	public InterviewQuestionsDto getCoreJavaQuestions();
	
	@GetMapping(value = "X-workzDev01/JSON/master/Interview-Questions-Updated/mysql.json" ,  
			consumes = MediaType.TEXT_PLAIN_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
	public InterviewQuestionsDto getMySqlQuestions();
	
	@GetMapping(value = "X-workzDev01/JSON/master/Interview-Questions-Updated/Advanced-Java.json" ,  
			consumes = MediaType.TEXT_PLAIN_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
	public InterviewQuestionsDto getAdvancedJavaQuestions();
	
	@GetMapping(value = "X-workzDev01/JSON/master/Interview-Questions-Updated/Spring.json" ,  
			consumes = MediaType.TEXT_PLAIN_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
	public InterviewQuestionsDto getSpringQuestions();
	
	

}

