package com.DockerLearning.DockerLearning.controller;

import com.DockerLearning.DockerLearning.model.Students;
import com.DockerLearning.DockerLearning.service.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentsRepository repo;


    @RequestMapping("/getStudents")
    public List<Students> getStudents() {
        return repo.findAll();
    }
}
