package com.jobfull.jobFull.jobPostManagement.repository;

import com.jobfull.jobFull.jobPostManagement.model.JobPostModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobPostRepository extends JpaRepository<JobPostModel, UUID> {
}
