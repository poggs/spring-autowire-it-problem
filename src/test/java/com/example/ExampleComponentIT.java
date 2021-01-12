package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {IntegrationTestContext.class})
class ExampleComponentIT {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired(required = false)
    private ExampleComponent exampleComponent;

    @Test
    void exampleComponentTest() {
        System.out.println("Running exampleComponentTest()");
        assertNotNull(exampleComponent);
    }

    @Test
    void showBeans() {

        System.out.println("Found the following beans:");
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("--------");
        assertTrue(true);

    }

}
