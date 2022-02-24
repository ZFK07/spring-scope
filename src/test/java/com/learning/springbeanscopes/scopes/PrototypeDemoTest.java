package com.learning.springbeanscopes.scopes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {PrototypeDemo.class})
class PrototypeDemoTest {
    @Autowired
    PrototypeDemo prototypeDemo1;
    @Autowired
    PrototypeDemo prototypeDemo2;



    @Test
    void testPrototype(){
        assertNotSame(prototypeDemo1, prototypeDemo2);
    }

}