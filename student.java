package com.newstudentinform.newstudent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
    @Id
    private String id;
    private String name;
    private String email;
    private String section;

    public student(String id, String name, String email, String section) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.section = section;
    }

    public student() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
