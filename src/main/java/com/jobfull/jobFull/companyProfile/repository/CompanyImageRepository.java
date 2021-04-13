package com.jobfull.jobFull.companyProfile.repository;

import com.jobfull.jobFull.companyProfile.model.CompanyImageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CompanyImageRepository extends JpaRepository<CompanyImageModel, UUID> {

}
