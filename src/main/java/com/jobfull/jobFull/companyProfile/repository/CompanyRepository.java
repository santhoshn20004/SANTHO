package com.jobfull.jobFull.companyProfile.repository;

import com.jobfull.jobFull.companyProfile.model.CompanyModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyRepository extends JpaRepository<CompanyModel, UUID> {

}
