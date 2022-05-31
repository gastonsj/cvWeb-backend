package com.portfolio.portfolio.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable=false, updatable=false)
    private Long id;
    @Column(name="firstName", length = 50)
    private String firstName;
    @Column(name="lastName", length = 50)
    private String lastName;
    @Column(name="email", length = 50)
    private String email;
    @Column(name="birthday", length = 50)
    private String birthday;
    @Column(name="address", length = 120)
    private String address;
    @Column(name="phone", length = 50)
    private String phone;
    @Column(name="about", length = 50)
    private String about;
    @Column(name="url_photo", length = 300)
    private String url_photo;
    @Column(name="url_linkedin", length = 100)
    private String url_linkedin;
    @Column(name="url_github", length = 100)
    private String url_github;
    @Column(name="url_facebook", length = 100)
    private String url_facebook;

    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id" )
    private List<Education> educationList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id" )
    private List<Experiences> experiencesList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id" )
    private List<Skills> skillsList;
    
    public User() {
    }
        
    public User(Long id, String firstName, String lastName, String email, String birthday, String address, String phone, String about, String url_photo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.about = about;
        this.url_photo = url_photo;
    }
    
     public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public void setUrl_photo(String url_photo) {
        this.url_photo = url_photo;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getAbout() {
        return about;
    }

    public String getUrl_photo() {
        return url_photo;
    }
    public void setUrl_linkedin(String url_linkedin) {
        this.url_linkedin = url_linkedin;
    }

    public void setUrl_github(String url_github) {
        this.url_github = url_github;
    }

    public void setUrl_facebook(String url_facebook) {
        this.url_facebook = url_facebook;
    }

    public String getUrl_linkedin() {
        return url_linkedin;
    }

    public String getUrl_github() {
        return url_github;
    }

    public String getUrl_facebook() {
        return url_facebook;
    }
}
