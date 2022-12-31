package com.basf.challenge.entity;

import org.springframework.data.annotation.Id;

public class Patent {
    @Id
    public String id;
    public Integer year;
    public String title;
    public String _abstract;

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String get_abstract() {
        return _abstract;
    }

    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    @Override
    public String toString() {
        return String.format(
                "Patent[id=%s, year='%s', title='%s', abstract='%s']",
                id, year, title, _abstract);
    }

}
