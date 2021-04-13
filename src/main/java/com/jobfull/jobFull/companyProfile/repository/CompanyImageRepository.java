package com.jobfull.jobFull.companyProfile.repository;

import com.jobfull.jobFull.companyProfile.model.CompanyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyImageRepository extends JpaRepository<CompanyModel, Integer> {

}
