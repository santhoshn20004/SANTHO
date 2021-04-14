package com.jobfull.jobFull.jobHunterProfile.model;

import com.jobfull.jobFull.userManagement.model.UserModel;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "job_hunter_skill_set")
@Data
public class JobHunterSkillSet implements Serializable {

    @Id
    @JoinColumn(name = "user_id")
    @ManyToOne
    private UserModel userModel;


    private Integer skillLevel;



}
