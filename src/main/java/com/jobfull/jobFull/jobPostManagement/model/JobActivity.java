package com.jobfull.jobFull.jobPostManagement.model;

import com.jobfull.jobFull.userManagement.model.UserModel;
import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public @Data
class JobActivity implements Serializable {

    @EmbeddedId
    private JobActivityId jobActivityId;

    @JoinColumn(name="job_id")
    @ManyToOne
    public JobPostModel job;

    @JoinColumn(name="user_id")
    @ManyToOne
    public UserModel user;

    private LocalDate applicationDate;
}

