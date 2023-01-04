package com.basf.challenge.controller;

import com.basf.challenge.contants.ResponseConstants;
import com.basf.challenge.dto.ResponseDataDTO;
import com.basf.challenge.dto.ResponseMessageDTO;
import com.basf.challenge.entity.Patent;
import com.basf.challenge.http.ResponseHandler;
import com.basf.challenge.service.xmlService.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.charset.StandardCharsets;

@Controller
@RequestMapping("/patent")
public class PatentController {
    @Autowired
    private PatentService service;

    @PostMapping("/upload") // //new annotation since 4.3
    public ResponseEntity<ResponseDataDTO> singleFileUpload(@RequestParam("file") MultipartFile file) {

        if (file.isEmpty()) {
            return ResponseHandler.response(
                    ResponseConstants.EF01.getStatus(),
                    ResponseConstants.EF01.getMessage(),
                    HttpStatus.NOT_ACCEPTABLE,
                    null
            );
        }
        var savedPatent = new Patent();
        try {
            String content = new String(file.getBytes(), StandardCharsets.UTF_8);
            savedPatent = service.readXmlData(content);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseHandler.response(
                ResponseConstants.OK.getStatus(),
                ResponseConstants.OK.getMessage(),
                HttpStatus.OK,
                savedPatent
        );
    }

    @GetMapping("")
    public ResponseEntity<ResponseDataDTO> getAllPatents() {
        var result = service.findAllPatents();
        return ResponseHandler.response(
                ResponseConstants.OK.getStatus(),
                ResponseConstants.OK.getMessage(),
                HttpStatus.OK,
                result
        );
    }

    @GetMapping("/id/{identifier}")
    public ResponseEntity<ResponseDataDTO> getPatentById(
            @PathVariable String identifier) {
        var result = service.findById(identifier);
        if (result.isEmpty()) {
            return ResponseHandler.response(
                    ResponseConstants.EP01.getStatus(),
                    ResponseConstants.EP01.getMessage(),
                    HttpStatus.NOT_FOUND,
                    null
            );
        } else {
            return ResponseHandler.response(
                    ResponseConstants.OK.getStatus(),
                    ResponseConstants.OK.getMessage(),
                    HttpStatus.OK,
                    result
            );
        }
    }

    @DeleteMapping("/delete/{identifier}")
    public ResponseEntity<ResponseMessageDTO> deletePatentById(@PathVariable String identifier) {
        var patent = service.findById(identifier);
        if (patent.isEmpty()) {
            return ResponseHandler.response(
                    ResponseConstants.EP01.getStatus(),
                    ResponseConstants.EP01.getMessage(),
                    HttpStatus.NOT_FOUND
            );
        } else {
            service.deleteById(patent.get());
        }
        return ResponseHandler.response(
                ResponseConstants.OK.getStatus(),
                ResponseConstants.OK.getMessage(),
                HttpStatus.OK
        );
    }
}
