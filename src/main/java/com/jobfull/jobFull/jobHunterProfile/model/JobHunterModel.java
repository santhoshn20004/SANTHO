package com.jobfull.jobFull.jobHunterProfile.model;

import com.jobfull.jobFull.userManagement.model.UserModel;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "job_hunters")
@Data
public class JobHunterModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "pg-uuid")
    private UUID id;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "user_model_id", referencedColumnName = "id")
    private UserModel userModel;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "jobHunter")
    private List<EducationDetail> educationDetail;

    @OneToMany(mappedBy = "jobHunter")
    private List<ExperienceDetail> experienceDetail;

    @OneToMany(mappedBy = "jobHunter")
    private List<JobHunterSkillSet> jobHunterSkillSet;


}
