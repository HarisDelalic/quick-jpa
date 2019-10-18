package com.jpa.quickjpa.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    protected User() {}

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.role;
    }
}
