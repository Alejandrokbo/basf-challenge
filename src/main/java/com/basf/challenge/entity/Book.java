package com.basf.challenge.entity;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "book")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "name", "author", "date"})
public class Book {
    private Long id;
    private String name;
    private String author;
    private Date date;

    @XmlAttribute
    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement(name = "title")
    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @XmlTransient
    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    // constructor, getters and setters
}

