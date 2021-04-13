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
public class JobActivityId implements Serializable {

    @Column(name = "users_id")
    private UUID jobHunterId;

    @Column(name = "job_post_id")
    private UUID jobPostId;
}
