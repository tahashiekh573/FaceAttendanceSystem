package com.example.FaceAttendanceSystem.repository;

import com.example.FaceAttendanceSystem.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
 UserEntity findByEmail(String email);
}