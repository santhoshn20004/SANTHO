package com.jobfull.jobFull.userManagement.registration;

import com.jobfull.jobFull.userManagement.model.UserTypeModel;
import lombok.*;

//registration Request

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private String email;
    private String password;
    private UserTypeModel role;
}
