package com.jobfull.jobFull.companyProfile.service;


import com.jobfull.jobFull.companyProfile.model.CompanyModel;
import com.jobfull.jobFull.jobPostManagement.model.JobPostModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface CompanyService {

    List<CompanyModel> getAll();

    CompanyModel save(CompanyModel company);

    Optional<CompanyModel> getById(UUID id);

    List<JobPostModel> getJobsForCompany(UUID companyId);

    void addJobToCompany(UUID id, JobPostModel job);

    List<JobPostModel> getActiveJobs(UUID companyId);

    CompanyModel updateCompany(UUID id, CompanyModel company);

    void deleteCompany(UUID companyId);

}