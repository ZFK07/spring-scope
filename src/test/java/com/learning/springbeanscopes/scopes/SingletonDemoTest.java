package com.learning.springbeanscopes.scopes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {SingletonDemo.class})
class SingletonDemoTest {

    SingletonDemo singletonDemoObject1;
    SingletonDemo singletonDemoObject2;

    @Test
    void testSingleton() {
        Assertions.assertSame(singletonDemoObject1, singletonDemoObject2);
    }


}