package com.jobfull.jobFull.jobPostManagement.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public @Data
class JobActivity implements Serializable {

    //    private JobHunterModel jobHunter;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @ManyToOne
    @MapsId
    @JoinColumn(name = "job_id")
    private JobPostModel job;

    private LocalDate applicationDate;

}
