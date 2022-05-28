package com.portfolio.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="schoolName", length = 70)
    private String schoolName;
    @Column(name="title", length = 50)
    private String title;
    @Column(name="start", length = 50)
    private String start;
    @Column(name="end", length = 50)
    private String end;
    @Column(name="description", length = 200)
    private String description;
    @Column(name="url_photo", length = 100)
    private String url_photo;
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getSchoolName() {
        return schoolName;
    }

    public String getTitle() {
        return title;
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

    public Education(Long id, String schoolName, String title, String start, String end, String description, String url_photo) {
        this.id = id;
        this.schoolName = schoolName;
        this.title = title;
        this.start = start;
        this.end = end;
        this.description = description;
        this.url_photo = url_photo;
    }

    public Education() {
    }
}
