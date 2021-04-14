package com.jobfull.jobFull.companyProfile.model;

import com.jobfull.jobFull.jobPostManagement.model.JobPostModel;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "company")
public @Data
class CompanyModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "pg-uuid")
    private UUID id;

    private String name;

    @OneToMany(mappedBy = "company")
    private List<CompanyImageModel> companyImage;

    @Column(length = 500)
    private String description;

    private LocalDate registrationDate;

    private String website;

    @OneToMany(mappedBy = "company")
    private List<JobPostModel> jobs;
}