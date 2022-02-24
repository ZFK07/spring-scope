package com.learning.springbeanscopes.prototype_inside_singleton.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = {School.class,Student.class})
class ProxyTest {

    @Autowired
    School schoolProxy;


    @Test
    void testDependencyIssue() {
        Student studentArif = schoolProxy.getStudent();
        studentArif.setName("Arif");
        Student studentZahid = schoolProxy.getStudent();
        studentZahid.setName("Zahid");
        Assertions.assertNotSame(studentArif.getName(), studentZahid.getName());
    }
}