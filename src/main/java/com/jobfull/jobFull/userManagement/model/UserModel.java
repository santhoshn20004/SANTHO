package com.jobfull.jobFull.userManagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "pg-uuid")
    private UUID id;

    @Enumerated(EnumType.STRING)
    private UserTypeModel role;
    private String email;
    private String password;



    @JsonFormat(pattern="yyyy-MM-dd",
    shape = JsonFormat.Shape.STRING)
    private LocalDate dateOfBirth;
    private String contactNumber;
    private byte[] userImage;
    private LocalDate registrationDate;
    private String city;
    private Boolean enabled = false;

    public boolean isEnabled() {
        return enabled;
    }

}
