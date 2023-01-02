package com.basf.challenge.controller;

import com.basf.challenge.contants.ResponseConstants;
import com.basf.challenge.dto.ResponseMessageDTO;
import com.basf.challenge.service.ResponseHandler;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Error404 implements ErrorController {

    @RequestMapping("/error")
    public ResponseEntity<ResponseMessageDTO> handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        var resp = ResponseHandler.response(
                ResponseConstants.OK.getStatus(),
                ResponseConstants.OK.getMessage(),
                HttpStatus.OK
        );

        if (status != null) {
            int statusCode = Integer.parseInt(status.toString());
            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                resp = ResponseHandler.response(
                        ResponseConstants.ERROR_404.getStatus(),
                        ResponseConstants.ERROR_404.getMessage(),
                        HttpStatus.NOT_FOUND);
            } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                resp = ResponseHandler.response(
                        ResponseConstants.ERROR_500.getStatus(),
                        ResponseConstants.ERROR_500.getMessage(),
                        HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return resp;
    }

}
