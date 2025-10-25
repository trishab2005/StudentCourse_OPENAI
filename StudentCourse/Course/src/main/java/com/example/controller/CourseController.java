package com.example.controller;

import com.example.service.AIClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/courses")

public class CourseController {

    //private final StudentClient studentClient;
    private final AIClient aiClient;

//    public CourseController(StudentClient studentClient) {
//        this.studentClient = studentClient;
//    }

    public CourseController(AIClient aiClient) {
        this.aiClient = aiClient;
    }

    @GetMapping("ia")
    public String getAIController() {
        return aiClient.prompt();
    }

//    @GetMapping("/students")
//    public List<Map<String, Object>> getStudentsFromStudentService() {
//        return studentClient.getAllStudents();
//    }
}