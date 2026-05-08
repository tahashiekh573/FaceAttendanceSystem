package com.example.FaceAttendanceSystem.config;

import jakarta.annotation.PostConstruct;
import org.opencv.core.Core;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenCVConfig {

    @PostConstruct
    public void init() {

        // DLL path set (if not system32)
        System.load("D:\\FaceAttendanceSystem\\libs\\opencv_java4120.dll");

        System.out.println("OpenCV 4.12 Loaded Successfully");
    }
}