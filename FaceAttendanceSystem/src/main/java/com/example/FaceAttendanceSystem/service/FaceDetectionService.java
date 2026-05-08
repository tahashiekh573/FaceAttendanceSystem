package com.example.FaceAttendanceSystem.service;

import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.videoio.VideoCapture;
import org.opencv.objdetect.CascadeClassifier;
import org.springframework.stereotype.Service;

@Service
public class FaceDetectionService {

    // Start Camera and Detect Face
    public String detectFace() {

        // Open webcam
        VideoCapture camera = new VideoCapture(0);

        // Check camera opened
        if (!camera.isOpened()) {
            return "❌ Camera not opened";
        }

        // Load face detection model
        CascadeClassifier faceDetector = new CascadeClassifier();

        faceDetector.load(
            "src/main/resources/haarcascade_frontalface_alt.xml"
        );

        // Image frame
        Mat frame = new Mat();

        // Read frame from camera
        camera.read(frame);

        // Face storage
        MatOfRect faceDetections = new MatOfRect();

        // Detect faces
        faceDetector.detectMultiScale(frame, faceDetections);

        // Count faces
        Rect[] faces = faceDetections.toArray();

        // Release camera
        camera.release();

        // Result
        if (faces.length > 0) {
            return "✅ Face Detected";
        } else {
            return "❌ No Face Found";
        }
    }
}