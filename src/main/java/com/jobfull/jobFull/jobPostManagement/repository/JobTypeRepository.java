package com.jobfull.jobFull.jobPostManagement.repository;

import com.jobfull.jobFull.jobPostManagement.model.JobType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTypeRepository extends JpaRepository<JobType, Integer> {
}
