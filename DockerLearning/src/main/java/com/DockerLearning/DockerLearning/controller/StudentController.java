package com.DockerLearning.DockerLearning.controller;

import com.DockerLearning.DockerLearning.model.Students;
import com.DockerLearning.DockerLearning.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentsService repo;


    @RequestMapping("/getStudents")
    public List<Students> getStudents() {
        return List.of(
                new Students("Chandra", 26, 22),
                new Students("Akshay", 23, 23)
        );
    }
}
