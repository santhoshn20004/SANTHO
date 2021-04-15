package com.jobfull.jobFull.companyProfile.controller;

import com.jobfull.jobFull.companyProfile.model.CompanyModel;
import com.jobfull.jobFull.companyProfile.service.CompanyService;
import com.jobfull.jobFull.jobPostManagement.model.JobPostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/companies")
@CrossOrigin(origins = "http://localhost:3000")
public class CompanyController {

    @Autowired
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseEntity<List<CompanyModel>> getCompanies() {
        return new ResponseEntity<>(companyService.getAll(), new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping
    public CompanyModel addCompany(@RequestBody CompanyModel companyModel) {
        return companyService.save(companyModel);
    }

    @GetMapping(value = "/{id}")
    public Optional<CompanyModel> getById(@PathVariable UUID id) {
        return companyService.getById(id);
    }

    @GetMapping(value = "/{companyId}/jobs")
    public List<JobPostModel> getCompanyJobs(@PathVariable UUID companyId) {
        return companyService.getJobsForCompany(companyId);
    }

    @PostMapping(path = "/{companyId}/jobs")
    public void addJobToCompany(@PathVariable UUID companyId, @RequestBody JobPostModel jobPostModel) {
        companyService.addJobToCompany(companyId, jobPostModel);
    }

    @GetMapping(path = "/{companyId}/jobs/active")
    public List<JobPostModel> getActiveJobs(@PathVariable UUID companyId) {
        return companyService.getActiveJobs(companyId);
    }

    @PatchMapping(value = "/{companyId}")
    public CompanyModel updateCompany(@PathVariable UUID companyId, @RequestBody CompanyModel companyModel) {
        return companyService.updateCompany(companyId, companyModel);
    }

    @DeleteMapping(value = "/{companyId}")
    public void deleteCompany(@PathVariable UUID companyId) {
        companyService.deleteCompany(companyId);
    }

}