package com.jobfull.jobFull.jobPostManagement.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public @Data
class JobType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String type;

    @OneToMany(mappedBy = "jobType")
    private List<JobPostModel> job;

}
