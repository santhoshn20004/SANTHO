package com.jobfull.jobFull.jobHunterProfile.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobHunterSkillSetId implements Serializable {

    @Column(name = "skill_set_id")
    private Integer skillSetId;

}
