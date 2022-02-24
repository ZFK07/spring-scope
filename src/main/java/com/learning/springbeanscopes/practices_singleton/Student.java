package com.learning.springbeanscopes.practices_singleton;

import lombok.Data;
import org.springframework.stereotype.Component;


@Component(value = "student")
@Data
public class Student {
    private String name;
}
