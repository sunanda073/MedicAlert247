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

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String pContact;  // Primary Contact
    private String sContact;  // Secondary Contact
    private String cAddress;  // Current Address
    private String pAddress;  // Permanent Address
    private String gender;


    @Column(length=100)
    private String profilePic;

    private Boolean enabled = true;

    private Boolean emailverified = false;

    private Boolean phoneVerified = false;

    private Providers provider = Providers.SELF;

    private String providerUserId;

    // private List<String> roleList = new ArrayList<>();
}
