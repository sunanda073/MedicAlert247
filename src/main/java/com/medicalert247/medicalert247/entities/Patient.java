package com.medicalert247.medicalert247.entities;

import java.util.List;
import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String patientId;


    @ManyToMany(mappedBy = "patients")
    private Set<Doctor> doctors;

    @ElementCollection
    private List<String> emergencyContact;

    @ElementCollection
    private List<String> allergies;

    @ElementCollection
    private List<String> currentHealthIssues;

    @ElementCollection
    private List<String> currentMedications;

}
