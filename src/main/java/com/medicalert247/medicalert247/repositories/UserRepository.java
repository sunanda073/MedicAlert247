package com.medicalert247.medicalert247.repositories;

import com.medicalert247.medicalert247.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
