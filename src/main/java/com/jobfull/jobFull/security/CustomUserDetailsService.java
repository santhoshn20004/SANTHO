package com.jobfull.jobFull.security;

import com.jobfull.jobFull.userManagement.model.UserModel;
import com.jobfull.jobFull.userManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


import java.util.Collections;
//customDetailesService

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository users;

    public CustomUserDetailsService(UserRepository users) {
        this.users = users;
    }

    /**
     * Loads the user from the DB and converts it to Spring Security's internal User object.
     * Spring will call this code to retrieve a user upon login from the DB.
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel users = this.users.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("Username: " + username + " not found"));

        return new User(users.getEmail(), users.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority(users.getRole().name())));
    }
}