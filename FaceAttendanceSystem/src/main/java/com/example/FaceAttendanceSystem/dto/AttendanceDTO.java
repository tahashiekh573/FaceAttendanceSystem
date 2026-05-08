package com.example.FaceAttendanceSystem.dto;

import java.time.LocalDateTime;

public class AttendanceDTO {

    private Long id;
    private String userName;
    private LocalDateTime time;

    // Getter Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public LocalDateTime getTime() { return time; }
    public void setTime(LocalDateTime time) { this.time = time; }
}
