package com.jobfull.jobFull.userManagement.model;

import io.swagger.models.auth.In;

import javax.persistence.*;

@Entity
@Table(name = "user_type")
public class UserTypeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String userTypeName;

}
