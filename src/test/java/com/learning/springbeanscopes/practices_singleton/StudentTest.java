package com.learning.springbeanscopes.practices_singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {Student.class})
class StudentTest {

    @Autowired
    Student student1;
    @Autowired
    Student student2;



    @Test
    void testSingleton(){
        student1.setName("Zahid");
        Assertions.assertSame(student1.getName(), student2.getName());
    }

}