package com.example.FaceAttendanceSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FaceAttendanceSystem.entity.AttendanceEntity;
public interface AttendanceRepository extends JpaRepository<AttendanceEntity, Long> {

}