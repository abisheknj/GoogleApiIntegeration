package com.xworkz.googleapiintegeration.dto.interviewquestions;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"Questions"
})

public class Topic {

@JsonProperty("name")
public String name;
@JsonProperty("Questions")
public List<Question> questions = null;

}