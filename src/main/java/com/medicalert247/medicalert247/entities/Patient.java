package com.medicalert247.medicalert247.entities;

import java.util.List;
import java.util.Set;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String patientId;


    private Set<Doctor> doctors;

    private List<String> emergencyContact;

    private List<String> allergies;

    private List<String> currentHealthIssues;
    
    private List<String> currentMedications;

}
