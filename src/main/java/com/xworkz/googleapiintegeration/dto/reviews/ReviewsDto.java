package com.xworkz.googleapiintegeration.dto.reviews;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Reviews"
})

public class ReviewsDto {

@JsonProperty("Reviews")
public List<Review> reviews = null;

}