package com.portfolio.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiences {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="companyName", length = 70)
    private String companyName;
    @Column(name="position", length = 50)
    private String position;
    @Column(name="start", length = 50)
    private String start;
    @Column(name="end", length = 50)
    private String end;
    @Column(name="description", length = 50)
    private String description;
    @Column(name="url_photo", length = 300)
    private String url_photo;
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl_photo(String url_photo) {
        this.url_photo = url_photo;
    }

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPosition() {
        return position;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl_photo() {
        return url_photo;
    }

    public Experiences(Long id, String companyName, String position, String start, String end, String description, String url_photo) {
        this.id = id;
        this.companyName = companyName;
        this.position = position;
        this.start = start;
        this.end = end;
        this.description = description;
        this.url_photo = url_photo;
    }

    public Experiences() {
    }
}
