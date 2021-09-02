package com.jobfull.jobFull.jobHunterProfile.service;

import com.jobfull.jobFull.jobHunterProfile.model.JobHunterModel;
import org.springframework.stereotype.Service;

@Service
public interface JobHunterService {
    JobHunterModel save(JobHunterModel jobHunterModel);
}
