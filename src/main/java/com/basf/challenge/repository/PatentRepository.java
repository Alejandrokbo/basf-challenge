package com.basf.challenge.repository;

import com.basf.challenge.entity.Patent;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PatentRepository extends MongoRepository<Patent, String> {
    List<Patent> findByYear(String year);
}
