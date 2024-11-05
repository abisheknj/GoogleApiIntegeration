package com.xworkz.googleapiintegeration.dto.reviews;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"content",
"rating",
"review_url"
})

public class Review {

@JsonProperty("name")
public String name;
@JsonProperty("content")
public String content;
@JsonProperty("rating")
public String rating;
@JsonProperty("review_url")
public String reviewUrl;

}