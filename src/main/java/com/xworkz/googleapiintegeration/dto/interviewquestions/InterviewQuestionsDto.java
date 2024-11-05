package com.xworkz.googleapiintegeration.dto.interviewquestions;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Topic"
})

public class InterviewQuestionsDto {

@JsonProperty("Topic")
public List<Topic> topic = null;

}