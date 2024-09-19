package com.medicalert247.medicalert247.entities;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Vaccinations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vaccinationId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate date;

    @JoinColumn(name = "patientId", nullable = false)
    private Patient patient;

    @Column(length = 100)
    private String certificate;

}
