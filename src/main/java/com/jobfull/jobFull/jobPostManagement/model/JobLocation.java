package com.jobfull.jobFull.jobPostManagement.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public @Data class JobLocation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String streetAddress;

    private String city;

    private String country;

    private String zip;

    @OneToMany(mappedBy = "jobLocation")
    private List<JobPostModel> job;

}
