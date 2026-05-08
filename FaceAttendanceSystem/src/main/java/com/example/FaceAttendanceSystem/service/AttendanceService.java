package com.example.FaceAttendanceSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FaceAttendanceSystem.entity.AttendanceEntity;
import com.example.FaceAttendanceSystem.repository.AttendanceRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    // ✅ Mark attendance
    public AttendanceEntity markAttendance(String userName) {

        AttendanceEntity att = new AttendanceEntity();
        att.setUserName(userName);
        att.setTime(LocalDateTime.now());

        return attendanceRepository.save(att);
    }

    // ✅ Get all
    public List<AttendanceEntity> getAll() {
        return attendanceRepository.findAll();
    }

    // ✅ Get by ID
    public AttendanceEntity getById(Long id) {
        return attendanceRepository.findById(id)
                .orElse(null);
    }

    // ✅ Delete
    public String delete(Long id) {
        attendanceRepository.deleteById(id);
        return "Deleted attendance id: " + id;
    }
}