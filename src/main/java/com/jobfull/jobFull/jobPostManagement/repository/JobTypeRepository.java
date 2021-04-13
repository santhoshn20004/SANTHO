package com.jobfull.jobFull.jobPostManagement.repository;

import com.jobfull.jobFull.jobPostManagement.model.JobType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTypeRepository extends JpaRepository<JobType, Integer> {
}
