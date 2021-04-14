package com.jobfull.jobFull.companyProfile.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


@Entity
public @Data
class CompanyImageModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private byte[] companyImage;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private CompanyModel company;
}
