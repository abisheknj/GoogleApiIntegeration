package com.xworkz.googleapiintegeration.dto.batches;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Upcoming",
"Ongoing",
"Completed"
})

public class Batch {

@JsonProperty("Upcoming")
private UpcomingBatch[] upcoming = null;
@JsonProperty("Ongoing")
private Ongoing[] ongoing = null;
@JsonProperty("Completed")
private CompletedBatch[] completed = null;

}
