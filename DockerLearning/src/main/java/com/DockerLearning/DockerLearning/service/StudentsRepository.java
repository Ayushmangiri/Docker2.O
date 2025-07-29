package com.DockerLearning.DockerLearning.service;

import com.DockerLearning.DockerLearning.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Students,Integer> {
}
