package com.basf.challenge.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("patent")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({"id", "year", "title", "abstract"})
@Data
public class Patent {
    @Id
    public String id;
    @JsonProperty("year")
    public String year;

    @JsonProperty("title")
    public List<Object> title;
    @JsonProperty("abstract")
    public List<Object> _abstract;
}


