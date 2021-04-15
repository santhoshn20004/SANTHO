package com.jobfull.jobFull.jobHunterProfile.controller;

import com.jobfull.jobFull.jobHunterProfile.model.JobHunterModel;
import com.jobfull.jobFull.jobHunterProfile.service.JobHunterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/jobhunter")
@CrossOrigin
public class JobHunterController {


    private final JobHunterService jobHunterService;

    @Autowired
    public JobHunterController(JobHunterService jobHunterService) {
        this.jobHunterService = jobHunterService;
    }

    @PostMapping
    public JobHunterModel addJobHunter(@RequestBody JobHunterModel jobHunterModel){ return jobHunterService.save(jobHunterModel);}
}