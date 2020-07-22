package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rolle_id;
    private String role;

    public Role() {
    }

    public Role(int rolle_id, String role) {
        this.rolle_id = rolle_id;
        this.role = role;
    }

    public int getRolle_id() {
        return rolle_id;
    }

    public void setRolle_id(int rolle_id) {
        this.rolle_id = rolle_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
