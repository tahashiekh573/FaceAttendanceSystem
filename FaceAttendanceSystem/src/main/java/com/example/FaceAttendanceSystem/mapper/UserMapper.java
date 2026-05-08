package com.example.FaceAttendanceSystem.mapper;

import com.example.FaceAttendanceSystem.entity.UserEntity;
import com.example.FaceAttendanceSystem.dto.UserDTO;

public class UserMapper {

    public static UserDTO mapToDTO(UserEntity user) {

        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setImagePath(user.getImagePath());

        return dto;
    }

    public static UserEntity mapToEntity(UserDTO dto) {

        UserEntity user = new UserEntity();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setImagePath(dto.getImagePath());

        return user;
    }
}
