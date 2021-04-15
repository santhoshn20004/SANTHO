package com.jobfull.jobFull.jobHunterProfile.model;

import com.jobfull.jobFull.jobPostManagement.model.JobSkillSet;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
@Data
public class SkillSet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "skill_set_name")
    private String name;

    @OneToMany(mappedBy = "skillSet")
    private List<JobHunterSkillSet> jobHunterSkillSet;

    @OneToMany(mappedBy = "skillSet")
    private List<JobSkillSet> jobSkillSet;


}
