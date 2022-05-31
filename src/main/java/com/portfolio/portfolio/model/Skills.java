package com.portfolio.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="skillName", length = 70)
    private String skillName;
    @Column(name="value")
    private float value;
    @Column(name="url_photo", length = 300)
    private String url_photo;
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setUrl_photo(String url_photo) {
        this.url_photo = url_photo;
    }

    public Long getId() {
        return id;
    }

    public String getSkillName() {
        return skillName;
    }

    public float getValue() {
        return value;
    }

    public String getUrl_photo() {
        return url_photo;
    }

    public Skills() {
    }

    public Skills(Long id, String skillName, float value, String url_photo) {
        this.id = id;
        this.skillName = skillName;
        this.value = value;
        this.url_photo = url_photo;
    }
}
