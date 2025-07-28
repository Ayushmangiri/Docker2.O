package com.DockerLearning.DockerLearning.controller;

import com.DockerLearning.DockerLearning.model.Students;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @RequestMapping("/getStudents")
    public List<Students> getStudents() {
        return List.of(
                new Students("Chandra", 26, 22),
                new Students("Akshay", 23, 23)
        );
    }
}
