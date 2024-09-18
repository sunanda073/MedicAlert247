package com.medicalert247.medicalert247.entities;

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
import java.time.LocalDate;


@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Surgeries {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long surgeryId;

    @Column(nullable = false)
    private String title;

    private LocalDate date;

    private String hospitalname;

    @JoinColumn(name = "patientId")
    private Patient patient;

    @JoinColumn(name = "reportId")
    private Reports report;




}
