package com.jobfull.jobFull.jobPostManagement.repository;

import com.jobfull.jobFull.jobPostManagement.model.JobLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobLocationRepository extends JpaRepository<JobLocation, Integer> {
}
