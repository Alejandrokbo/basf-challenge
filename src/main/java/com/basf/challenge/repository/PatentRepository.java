package com.basf.challenge.repository;

import com.basf.challenge.entity.Patent;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PatentRepository extends MongoRepository<Patent, String> {
    List<Patent> findPatentsByYear(String year);

    @NotNull
    Optional<Patent> findPatentById(@NotNull String id);
}
