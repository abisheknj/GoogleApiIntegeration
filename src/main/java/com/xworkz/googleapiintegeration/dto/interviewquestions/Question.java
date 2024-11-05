package com.xworkz.googleapiintegeration.dto.interviewquestions;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"question"
})

public class Question {

@JsonProperty("question")
public String question;

}