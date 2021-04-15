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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne
    private JobHunterModel jobHunter;

    private boolean isCurrentJob;
    private Date startDate;
    private Date endDate;

}
