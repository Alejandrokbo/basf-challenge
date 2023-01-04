package com.basf.challenge.service.xmlService;

import com.basf.challenge.entity.Patent;

public interface PatentService {
    Patent readXmlData(String xmlString) throws Exception;

}
