package com.example.FaceAttendanceSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.FaceAttendanceSystem.entity.UserEntity;
import com.example.FaceAttendanceSystem.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // ✅ CREATE USER
    @PostMapping("/create")
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userService.saveUser(user);
    }

    // ✅ GET ALL USERS
    @GetMapping("/all")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    // ✅ GET USER BY ID
    @GetMapping("/{id}")
    public UserEntity getById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // ✅ SEARCH BY EMAIL
    @GetMapping("/email")
    public UserEntity getByEmail(@RequestParam String email) {
        return userService.getUserByEmail(email);
    }

    // ✅ UPDATE USER
    @PutMapping("/update/{id}")
    public UserEntity updateUser(@PathVariable Long id,
                                 @RequestBody UserEntity user) {
        return userService.updateUser(id, user);
    }

    // ✅ DELETE USER
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
}
 
