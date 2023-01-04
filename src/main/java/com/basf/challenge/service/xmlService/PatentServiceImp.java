package com.basf.challenge.service.xmlService;

import com.basf.challenge.dto.xmlProperties.QuestelPatentDocument;
import com.basf.challenge.repository.PatentRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatentServiceImp implements PatentService {

    @Autowired
    PatentRepository repository;

    @Override
    public QuestelPatentDocument readXmlData(String xmlString) throws JsonProcessingException {
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        XmlMapper xmlMapper = new XmlMapper(module);
        xmlMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        QuestelPatentDocument questelPatentDocument;
        try {
            questelPatentDocument = xmlMapper.readValue(xmlString, QuestelPatentDocument.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        var year = questelPatentDocument.getDateProduced().substring(4);
        var tittle = questelPatentDocument.getBibliographicData().getInventionTitle().get(0).getContent();

        return questelPatentDocument;
    }

}
