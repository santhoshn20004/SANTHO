package com.jobfull.jobFull.userManagement.repository;

import com.jobfull.jobFull.userManagement.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {



}
