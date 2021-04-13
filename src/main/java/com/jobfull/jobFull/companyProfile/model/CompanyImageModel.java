package com.jobfull.jobFull.companyProfile.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


@Entity
public @Data
class CompanyImageModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private Integer companyId;
    private byte[] companyImage;

    @ManyToOne
    @MapsId
    @JoinColumn(name = "company_id")
    private CompanyModel company;
}
