package com.basf.challenge.service.xmlService;

import com.basf.challenge.entity.Patent;

import java.util.List;
import java.util.Optional;

public interface PatentService {
    Patent readXmlData(String xmlString) throws Exception;

    List<Patent> findAllPatents();

    Optional<Patent> findById(String id);

    void deleteById(Patent patent);

}
