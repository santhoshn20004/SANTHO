package com.jobfull.jobFull.jobPostManagement.controller;


import com.jobfull.jobFull.jobPostManagement.model.JobPostModel;
import com.jobfull.jobFull.jobPostManagement.service.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/jobs")
@CrossOrigin
public class JobPostController {

    private final JobPostService jobService;

    @Autowired
    public JobPostController(JobPostService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public List<JobPostModel> getAll() {
        return jobService.getAll();
    }
}
