package com.jobfull.jobFull.jobPostManagement.service;

import com.jobfull.jobFull.jobPostManagement.model.JobPostModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JobPostService {
    List<JobPostModel> getAll();
}
