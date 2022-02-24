package com.learning.springbeanscopes.prototype_inside_singleton.lookup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = {Student.class,School.class})
class LookupTest {
    @Autowired
    School school;

    @Test
    void testDependencyIssue() {
        Student studentArif = school.getStudent();
        studentArif.setName("Arif");
        Student studentZahid = school.getStudent();
        studentZahid.setName("Zahid");
        Assertions.assertNotEquals(studentArif.getName(), studentZahid.getName());
    }

}