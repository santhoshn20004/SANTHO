package com.jobfull.jobFull.userManagement.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "pg-uuid")
    private UUID id;

//    private UserTypeModel userTypeId;
    private String email;
    private String password;
    private LocalDate dateOfBirth;
    private String contactNumber;
    private byte[] userImage;
    private LocalDate registrationDate;
    private String city;

}
