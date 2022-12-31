package com.basf.challenge.controller;

import com.basf.challenge.dto.ResponseMessageDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    public ResponseMessageDTO hello() {
        ResponseMessageDTO resp = new ResponseMessageDTO();
        resp.status = "OK";
        resp.message = "Server is Online";
        return resp;
    }
}
