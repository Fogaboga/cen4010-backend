package com.example.demo.model;

import java.io.Serializable;

import org.mindrot.jbcrypt.BCrypt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "username", nullable = false, columnDefinition = "VARCHAR(50)")
    private String username;

    @Column(name = "password", nullable = false, columnDefinition = "VARCHAR(50)")
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
