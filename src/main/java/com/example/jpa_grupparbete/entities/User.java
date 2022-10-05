package com.example.jpa_grupparbete.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "NotUser")
public class UserId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Resource> resourceSet;

    public UserId() {
    }

    public UserId(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
