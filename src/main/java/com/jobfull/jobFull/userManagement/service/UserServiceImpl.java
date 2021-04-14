package com.jobfull.jobFull.userManagement.service;

import com.jobfull.jobFull.userManagement.model.UserModel;
import com.jobfull.jobFull.userManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<UserModel> findByEmail(String name) {
        return userRepository.findByEmail(name);
    }

    @Override
    public UserModel save(UserModel userModel) {
       return userRepository.save(userModel);

    }

    @Override
    public List<UserModel> findAll() {
        return userRepository.findAll();
    }


}
