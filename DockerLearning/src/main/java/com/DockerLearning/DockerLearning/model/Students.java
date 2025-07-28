package com.DockerLearning.DockerLearning.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {
    private String name;
    private int id;
    private int age;
}
