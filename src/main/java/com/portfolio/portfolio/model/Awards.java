package com.portfolio.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Awards {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="title", length = 70)
    private String title;
    @Column(name="date")
    private String date;
    @Column(name="url_photo", length = 100)
    private String url_photo;
}
