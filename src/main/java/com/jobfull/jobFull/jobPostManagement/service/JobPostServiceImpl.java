package com.jobfull.jobFull.jobPostManagement.service;

import com.jobfull.jobFull.jobPostManagement.model.JobPostModel;
import com.jobfull.jobFull.jobPostManagement.repository.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostServiceImpl implements JobPostService{

    @Autowired
    private JobPostRepository jobRepository;

    @Override
    public List<JobPostModel> getAll() {
        return jobRepository.findAll();
    }
}
