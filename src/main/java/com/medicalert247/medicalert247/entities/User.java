package com.medicalert247.medicalert247.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    private String userId;

    @Column(nullable = false)
    private String name = "USER";

    private int age;

    private String gender;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private String address;

    @Column(nullable = false)
    private String primaryContact;

    private String secondaryContact;

    @Column(length = 100)
    private String profilePic;

    private boolean enabled = true;

    private boolean emailVerified = false;

    private boolean phoneVarified = false;

}
