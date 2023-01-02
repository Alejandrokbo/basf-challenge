package com.basf.challenge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseDataDTO {

    @JsonProperty("data")
    public Object data;
    public ResponseMessageDTO responseMessageDTO;
}
