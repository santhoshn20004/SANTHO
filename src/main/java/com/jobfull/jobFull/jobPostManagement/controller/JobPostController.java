package com.jobfull.jobFull.jobPostManagement.controller;


import com.jobfull.jobFull.jobPostManagement.service.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/jobs")
@CrossOrigin
public class JobPostController {

    private final JobPostService jobService;

    @Autowired
    public JobPostController(JobPostService jobService) {
        this.jobService = jobService;
    }

}
