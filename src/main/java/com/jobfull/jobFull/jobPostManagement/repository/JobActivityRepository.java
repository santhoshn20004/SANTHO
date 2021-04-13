package com.jobfull.jobFull.jobPostManagement.repository;

import com.jobfull.jobFull.jobPostManagement.model.JobActivity;
import com.jobfull.jobFull.jobPostManagement.model.JobActivityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobActivityRepository extends JpaRepository<JobActivity, JobActivityId> {
}
