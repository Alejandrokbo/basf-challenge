package com.basf.challenge.controller;

import com.basf.challenge.contants.ResponseConstants;
import com.basf.challenge.dto.ResponseMessageDTO;
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
        ResponseMessageDTO resp = new ResponseMessageDTO();
        resp.status = ResponseConstants.OK.getStatus();
        resp.message = ResponseConstants.OK.getMessage();

        if (status != null) {
            int statusCode = Integer.parseInt(status.toString());
            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                resp.status = ResponseConstants.ERROR_404.getStatus();
                resp.message = ResponseConstants.ERROR_404.getMessage();
            } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                resp.status = ResponseConstants.ERROR_500.getStatus();
                resp.message = ResponseConstants.ERROR_500.getMessage();
            }
        }
        return new ResponseEntity<>(
                resp,
                HttpStatus.OK
        );
    }

}
