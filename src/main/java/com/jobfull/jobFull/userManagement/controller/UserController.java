package com.jobfull.jobFull.userManagement.controller;

import com.jobfull.jobFull.userManagement.model.UserModel;
import com.jobfull.jobFull.userManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/user")
@CrossOrigin
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = "/users")
    @PreAuthorize("hasAnyAuthority('COMPANY')")
    public ResponseEntity<List<UserModel>> getAllUsers(){
        return new ResponseEntity<>(userService.findAll(), new HttpHeaders(), HttpStatus.OK);
    }




}
