package com.example.authmicroservice.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_Id")
    private Integer id;

    @Column(name = "User_Name")
    private String userName;

    @Column(name = "Password")
    private String password;
}
