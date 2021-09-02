package com.jobfull.jobFull.jobHunterProfile.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "job_hunter_skill_set")
@Data
public class JobHunterSkillSet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne
    private JobHunterModel jobHunter;

    @JoinColumn(name = "skillset_id", nullable = false)
    @ManyToOne
    private SkillSet skillSet;

//    what would be the scale? are we implementing an enum or?
    private Integer skillLevel;

/*
 * to check the diagrams connections between jobActivity and JobHunterSkillSet vs UserModel.
 * We need to implement the other part of the connection in JobActivity
 * or we delete this part of the connection.
 *
 * */
//    @OneToMany(mappedBy = "jobHunter")
//    private JobActivity jobActivity;
//




}
