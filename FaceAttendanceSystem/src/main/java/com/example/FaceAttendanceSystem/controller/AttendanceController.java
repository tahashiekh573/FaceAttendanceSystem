package com.example.FaceAttendanceSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.FaceAttendanceSystem.entity.AttendanceEntity;
import com.example.FaceAttendanceSystem.service.AttendanceService;

import java.util.List;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    // ✅ Mark attendance
    @PostMapping("/mark/{userName}")
    public AttendanceEntity markAttendance(@PathVariable String userName) {
        return attendanceService.markAttendance(userName);
    }

    // ✅ Get all records
    @GetMapping("/all")
    public List<AttendanceEntity> getAll() {
        return attendanceService.getAll();
    }

    // ✅ Get by ID
    @GetMapping("/{id}")
    public AttendanceEntity getById(@PathVariable Long id) {
        return attendanceService.getById(id);
    }

    // ✅ Delete
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return attendanceService.delete(id);
    }
}