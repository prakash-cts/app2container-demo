package com.example.demo.usecase1;

import jakarta.persistence.*;

/**
 * @author 868065
 */
@Entity
@Table
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public UserDetails(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserDetails(String name) {
        this.name = name;
    }

    public UserDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
