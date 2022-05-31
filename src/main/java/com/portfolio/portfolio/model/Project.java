package com.portfolio.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="projectName", length = 70)
    private String projectName;
    @Column(name="projectDate", length = 50)
    private String projectDate;
    @Column(name="description", length = 200)
    private String description;
    @Column(name="url_photo", length = 300)
    private String url_photo;
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    public String getProjectName() {
        return projectName;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl_photo() {
        return url_photo;
    }

    public String getProjectDate() {
        return projectDate;
    }

    public void setProjectDate(String projectDate) {
        this.projectDate = projectDate;
    }

    public Project() {
    }

    public Project(Long id, String projectName, String projectDate, String description, String url_photo) {
        this.id = id;
        this.projectName = projectName;
        this.projectDate = projectDate;
        this.description = description;
        this.url_photo = url_photo;
    }
    
}
