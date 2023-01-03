package com.basf.challenge.service.xmlService;

import com.basf.challenge.dto.xmlProperties.QuestelPatentDocument;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface PatentService {
    QuestelPatentDocument readXmlData(String xmlString) throws JsonProcessingException;

}
