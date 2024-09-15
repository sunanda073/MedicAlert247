package com.medicalert247.medicalert247.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Doctor extends User {

    private String location;
    private String specializedIn;
    private String hospital;
    private String docRegistrationId;
    private int experience;
    private double fees;
    
}

