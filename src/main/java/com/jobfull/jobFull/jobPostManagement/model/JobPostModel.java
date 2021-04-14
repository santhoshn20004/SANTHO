package com.jobfull.jobFull.jobPostManagement.model;

import com.jobfull.jobFull.companyProfile.model.CompanyModel;
import com.jobfull.jobFull.userManagement.model.UserModel;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "job_post")
public @Data
class JobPostModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "pg-uuid")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel postedByUser;

    @ManyToOne
    @JoinColumn(name = "job_type_id")
    private JobType jobType;

    @ManyToOne
    @JoinColumn(name = "company")
    private CompanyModel company;

    private LocalDate createdDate;

    @Column(length = 500)
    private String description;

    @ManyToOne
    @JoinColumn(name = "job_location_id")
    private JobLocation jobLocation;

    private boolean isActive;

}
