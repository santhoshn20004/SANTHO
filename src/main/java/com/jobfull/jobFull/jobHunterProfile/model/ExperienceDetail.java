package com.jobfull.jobFull.jobHunterProfile.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "experience_details")
@Data
public class ExperienceDetail implements Serializable {

    @Id
    @Column(name = "user_id")
    private UUID userId;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "user_id")
    private JobHunterModel jobHunterModel;

    private boolean isCurrentJob;
    private Date startDate;
    private Date endDate;

}
