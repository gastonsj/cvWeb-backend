package com.portfolio.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Languages {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="languageName")
    private String languageName;
    @Column(name="avrValue")
    private float avrValue;
    @Column(name="speakingValue")
    private float speakingValue;
    @Column(name="readingValue")
    private float readingValue;
    @Column(name="writingValue")
    private float writingValue;
    @Column(name="listeningValue")
    private float listeningValue;
    @Column(name="url_photo", length = 300)
    private String url_photo;
}
