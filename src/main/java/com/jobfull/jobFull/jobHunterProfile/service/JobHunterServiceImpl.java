package com.jobfull.jobFull.jobHunterProfile.service;

import com.jobfull.jobFull.jobHunterProfile.model.JobHunterModel;
import com.jobfull.jobFull.jobHunterProfile.repository.JobHunterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobHunterServiceImpl implements JobHunterService{
    @Autowired
    private JobHunterRepository jobHunterRepository;

    @Override
    public JobHunterModel save(JobHunterModel jobHunterModel) {
        return jobHunterRepository.save(jobHunterModel);
    }
}
