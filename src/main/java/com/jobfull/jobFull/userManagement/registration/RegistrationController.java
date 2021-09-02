package com.jobfull.jobFull.userManagement.registration;

import com.jobfull.jobFull.userManagement.model.UserModel;
import com.jobfull.jobFull.userManagement.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/api/v1/registration")
@CrossOrigin(origins = "http://localhost:3000")
public class RegistrationController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserServiceImpl userService;


    @PostMapping("/signup")
    public ResponseEntity<UserModel> register(@RequestBody RegistrationRequest request){
        String email = request.getEmail();
        String password = passwordEncoder.encode(request.getPassword());

        UserModel userModel = UserModel.builder()
                .email(email)
                .role(request.getRole())
                .password(password)
                .city(request.getCity())
                .dateOfBirth(request.getDateOfBirth())
                .registrationDate(LocalDate.now())
                .contactNumber(request.getContactNumber())
                .build();

        if((userService.findByEmail(email).isPresent())){
            return new ResponseEntity<>(null, new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(userService.save(userModel), new HttpHeaders(), HttpStatus.OK);


    }

}
