package com.xworkz.googleapiintegeration.dto.interviewquestions;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Module"
})

public class InterviewQuestionsTree {

@JsonProperty("Module")
public List<Module> module = null;

}