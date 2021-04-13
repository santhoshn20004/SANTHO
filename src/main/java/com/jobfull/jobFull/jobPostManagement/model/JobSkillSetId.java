package com.jobfull.jobFull.jobPostManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobSkillSetId implements Serializable {

    @Column(name = "skill_set_id")
    private Integer skillSetId;

    @Column(name = "job_post_id")
    private UUID jobPostId;
}
