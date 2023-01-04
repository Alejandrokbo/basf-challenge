package com.basf.challenge.service.xmlService;

import com.basf.challenge.dto.xmlProperties.InventionTitle;
import com.basf.challenge.dto.xmlProperties.QuestelPatentDocument;
import com.basf.challenge.entity.Patent;
import com.basf.challenge.repository.PatentRepository;
import com.basf.challenge.utils.StringParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

import static com.basf.challenge.utils.StringTools.cleanText;

@Service
public class PatentServiceImp implements PatentService {

    @Autowired
    PatentRepository repository;

    @Override
    public Patent readXmlData(String xmlString) throws Exception {
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

        var patent = new Patent();
        patent.year = questelPatentDocument.getDateProduced().substring(0, 4);

        var titleList = new ArrayList<>();
        var inventionTitleList = questelPatentDocument.getBibliographicData().getInventionTitle();
        for (InventionTitle inventionTitle : inventionTitleList) {
            var newTitle = new HashMap<String, String>();
            newTitle.put(inventionTitle.getId(), cleanText(inventionTitle.getContent()));
            titleList.add(newTitle);
        }
        patent.setTitle(titleList);

        var xmlParser = new StringParser(xmlString);
        var _abstract = xmlParser.nextToken("<abstract", 1, "</abstract", true);
        var brContent = new StringParser(_abstract).nextRelativeToken("<p", ">", 1, "</p", true);

        var abstractArray = brContent.split("<br/>");
        var predicates = new ArrayList<>();
        for (int i = 1; i < abstractArray.length; i++) {
            var sentence = new HashMap<Integer, String>();
            sentence.put(i, cleanText(abstractArray[i]));
            predicates.add(sentence);
        }
        patent.set_abstract(predicates);
        return repository.save(patent);
    }

}
