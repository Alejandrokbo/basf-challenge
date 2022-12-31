package com.basf.challenge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseMessageDTO {
    @JsonProperty("status")
    public String status;
    @JsonProperty("message")
    public String message;
}
