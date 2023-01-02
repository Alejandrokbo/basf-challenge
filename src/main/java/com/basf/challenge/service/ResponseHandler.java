package com.basf.challenge.service;

import com.basf.challenge.dto.ResponseDataDTO;
import com.basf.challenge.dto.ResponseMessageDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {

    public static ResponseEntity<ResponseMessageDTO> response(String statusMessage, String message, HttpStatus status) {
        var resp = new ResponseMessageDTO();
        resp.statusMessage = statusMessage;
        resp.message = message;
        return new ResponseEntity<>(resp, defaultHeaders(), status);
    }

    public static ResponseEntity<ResponseDataDTO> response(String statusMessage, String message, HttpStatus status, Object responseObj) {
        var resp = new ResponseDataDTO();
        resp.data = responseObj;
        var mess = new ResponseMessageDTO();
        mess.statusMessage = statusMessage;
        mess.message = message;
        resp.responseMessageDTO = mess;
        return new ResponseEntity<>(resp, defaultHeaders(), status);
    }

    private static HttpHeaders defaultHeaders() {
        var headers = new HttpHeaders();
        headers.set("Content-Type", String.valueOf(MediaType.APPLICATION_JSON));
        return headers;
    }

}
