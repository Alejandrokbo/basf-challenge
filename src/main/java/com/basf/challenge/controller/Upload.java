package com.basf.challenge.controller;

import com.basf.challenge.contants.ResponseConstants;
import com.basf.challenge.dto.ResponseDataDTO;
import com.basf.challenge.entity.Patent;
import com.basf.challenge.http.ResponseHandler;
import com.basf.challenge.service.xmlService.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.nio.charset.StandardCharsets;

@Controller
public class Upload {
    //Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "C://temp//";

    @Autowired
    private PatentService service;

    @PostMapping("/upload") // //new annotation since 4.3
    public ResponseEntity<ResponseDataDTO> singleFileUpload(@RequestParam("file") MultipartFile file,
                                                            RedirectAttributes redirectAttributes) {

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
}
