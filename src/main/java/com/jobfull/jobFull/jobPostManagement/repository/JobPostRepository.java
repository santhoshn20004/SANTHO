package com.jobfull.jobFull.jobPostManagement.repository;

import com.jobfull.jobFull.jobPostManagement.model.JobPostModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JobPostRepository extends JpaRepository<JobPostModel, UUID> {
}
