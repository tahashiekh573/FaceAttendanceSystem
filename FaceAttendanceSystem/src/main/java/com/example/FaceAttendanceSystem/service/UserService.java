package com.example.FaceAttendanceSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FaceAttendanceSystem.entity.UserEntity;
import com.example.FaceAttendanceSystem.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // SAVE
    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
    }

    // GET ALL
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    // GET BY ID
    public UserEntity getUserById(Long id) {
        return userRepository.findById(id)
                .orElse(null);
    }

    // GET BY EMAIL
    public UserEntity getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // UPDATE
    public UserEntity updateUser(Long id, UserEntity newUser) {

        UserEntity oldUser = userRepository.findById(id)
                .orElse(null);

        if (oldUser != null) {
            oldUser.setName(newUser.getName());
            oldUser.setEmail(newUser.getEmail());
            oldUser.setImagePath(newUser.getImagePath());

            return userRepository.save(oldUser);
        }

        return null;
    }

    // DELETE
    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "User deleted with id: " + id;
    }
}