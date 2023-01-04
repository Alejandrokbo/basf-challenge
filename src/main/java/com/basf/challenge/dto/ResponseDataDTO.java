package com.basf.challenge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({"status", "message", "data"})
public class ResponseDataDTO {

    @JsonProperty("data")
    public Object data;
    @JsonProperty("status")
    public String statusMessage;
    @JsonProperty("message")
    public String message;
}
