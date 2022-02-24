package com.learning.springbeanscopes.prototype_inside_singleton.lookup;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component(value = "schoolLookup")
@Slf4j
@Setter
@NoArgsConstructor
public class School {
    private String name;

    @Autowired
    Student student;

    @Lookup
    public Student getAStudent() {
        return null;
    }

    public Student getStudent() {
        student = getAStudent();
        return student;
    }


}
