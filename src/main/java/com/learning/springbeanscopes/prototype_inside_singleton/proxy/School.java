package com.learning.springbeanscopes.prototype_inside_singleton.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "schoolProxy")
@Slf4j
public class School {
    private String name;

    @Autowired
    private Student student;        //prototype

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School() {
        System.out.println("School object has been created.");
    }
}
