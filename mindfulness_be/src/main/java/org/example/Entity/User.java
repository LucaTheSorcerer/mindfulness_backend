package org.example.Entity;

import jakarta.persistence.*;
import lombok.Data;


import javax.annotation.processing.Generated;
import java.util.Collection;
import java.util.Collections;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(unique = true, name="username")
    private String username;
    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String role;



}
