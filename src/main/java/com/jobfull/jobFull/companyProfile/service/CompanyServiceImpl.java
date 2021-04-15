package com.jobfull.jobFull.companyProfile.service;

import com.jobfull.jobFull.companyProfile.model.CompanyModel;
import com.jobfull.jobFull.companyProfile.repository.CompanyRepository;
import com.jobfull.jobFull.jobPostManagement.model.JobPostModel;
import com.jobfull.jobFull.jobPostManagement.repository.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CompanyServiceImpl  implements  CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private JobPostRepository jobPostRepository;

    @Override
    public List<CompanyModel> getAll() {
        return companyRepository.findAll();
    }

    @Override
    public CompanyModel save(CompanyModel company) {
        return companyRepository.save(company);
    }

    @Override
    public Optional<CompanyModel> getById(UUID id) {
        return companyRepository.findById(id);
    }

    @Override
    public List<JobPostModel> getJobsForCompany(UUID companyId) {
        return jobPostRepository.findByCompanyId(companyId);
    }

    @Override
    public void addJobToCompany(UUID id, JobPostModel job) {

        CompanyModel companyModel = companyRepository.findById(id).get();
        job.setCompany(companyModel);
        jobPostRepository.save(job);

    }

    @Override
    public List<JobPostModel> getActiveJobs(UUID companyId) {
        return jobPostRepository.findByCompanyIdAndIsActiveTrue(companyId);
    }

    @Override
    public CompanyModel updateCompany(UUID id, CompanyModel company) {
        CompanyModel companyModel = companyRepository.findById(id).get();

        if(company.getName() != null) companyModel.setName(company.getName());
        if(company.getDescription() != null) companyModel.setDescription(company.getDescription());
        if(company.getCompanyImage() != null) companyModel.setCompanyImage(company.getCompanyImage());
        if(company.getRegistrationDate() != null) companyModel.setRegistrationDate(company.getRegistrationDate());
        if(company.getWebsite() != null) companyModel.setWebsite(company.getWebsite());
        if(company.getJobs() != null) companyModel.setJobs(company.getJobs());

        return companyRepository.save(companyModel);
    }

    @Override
    public void deleteCompany(UUID companyId) {
        CompanyModel companyModel = companyRepository.findById(companyId).get();
        companyRepository.delete(companyModel);

    }
}

