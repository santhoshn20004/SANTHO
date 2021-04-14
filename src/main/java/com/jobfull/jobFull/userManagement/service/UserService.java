package com.jobfull.jobFull.userManagement.service;

import com.jobfull.jobFull.userManagement.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    Optional<UserModel> findByEmail(String name);

    UserModel save(UserModel userModel);

    List<UserModel> findAll();


}
