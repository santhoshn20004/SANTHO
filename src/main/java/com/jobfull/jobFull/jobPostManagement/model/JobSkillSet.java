package com.jobfull.jobFull.jobPostManagement.model;

import com.jobfull.jobFull.jobHunterProfile.model.SkillSet;
import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public @Data
class JobSkillSet implements Serializable {

    @EmbeddedId
    private JobActivityId jobActivityId;

    @JoinColumn(name="job_id")
    @ManyToOne
    public JobPostModel job;

    @JoinColumn(name="skillset_id")
    @ManyToOne
    public SkillSet skillSet;

    private Integer skillLevel;
}

