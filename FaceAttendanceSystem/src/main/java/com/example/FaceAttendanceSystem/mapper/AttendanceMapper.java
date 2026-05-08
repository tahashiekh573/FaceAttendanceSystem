package com.example.FaceAttendanceSystem.mapper;

import com.example.FaceAttendanceSystem.entity.AttendanceEntity;
import com.example.FaceAttendanceSystem.dto.AttendanceDTO;

public class AttendanceMapper {

    public static AttendanceDTO mapToDTO(AttendanceEntity att) {

        AttendanceDTO dto = new AttendanceDTO();
        dto.setId(att.getId());
        dto.setUserName(att.getUserName());
        dto.setTime(att.getTime());

        return dto;
    }

    public static AttendanceEntity mapToEntity(AttendanceDTO dto) {

        AttendanceEntity att = new AttendanceEntity();
        att.setId(dto.getId());
        att.setUserName(dto.getUserName());
        att.setTime(dto.getTime());

        return att;
    }
}
