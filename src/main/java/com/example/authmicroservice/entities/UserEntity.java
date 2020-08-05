package com.example.authmicroservice.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "User_Id")
    private Integer id;

    @Column(name = "User_Name")
    private String userName;

    @Column(name = "Password")
    private String password;
}
