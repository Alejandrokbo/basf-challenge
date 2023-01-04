package com.basf.challenge.controller.api;

import com.basf.challenge.contants.ResponseConstants;
import com.basf.challenge.dto.ResponseMessageDTO;
import com.basf.challenge.http.ResponseHandler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(tags = "HELLO")
@Controller
@RequestMapping("/status")
public class ServerStatus {
    @ApiOperation(value = "")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK")
    })
    @ResponseBody
    @GetMapping("")
    public ResponseEntity<ResponseMessageDTO> hello() {
        return ResponseHandler.response(
                ResponseConstants.OK.getStatus(),
                ResponseConstants.OK.getMessage(),
                HttpStatus.OK);
    }
}
