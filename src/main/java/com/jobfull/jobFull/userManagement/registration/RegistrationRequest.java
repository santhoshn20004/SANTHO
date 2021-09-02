package com.jobfull.jobFull.userManagement.registration;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jobfull.jobFull.userManagement.model.UserTypeModel;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

//registration Request

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest implements Serializable {

    private String email;
    private String password;
    private UserTypeModel role;
    @JsonFormat(pattern="yyyy-MM-dd",shape = JsonFormat.Shape.STRING)
    private LocalDate dateOfBirth;
    private String contactNumber;
    private String city;
    private byte[] userImage;
}
