package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = IntegrationTestContext.class)
class ExampleComponentIT {

    @Autowired
    private ExampleComponent exampleComponent;

    @Test
    void exampleFacadeTest() {
        System.out.println("Running exampleFacadeTest()");
        assertNotNull(exampleComponent);
    }

}
