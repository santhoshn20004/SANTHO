package com.jobfull.jobFull.jobHunterProfile.model;

import com.jobfull.jobFull.userManagement.model.UserModel;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "job_hunters")
@Data
public class JobHunterModel implements Serializable {

    @Id
    @Column(name = "user_id")
    private UUID userId;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
    private UserModel userModel;


    private String firstName;

    private String lastName;

}
