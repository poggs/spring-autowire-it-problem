package com.example;

import org.springframework.stereotype.Component;

@Component
public class ExampleComponent {

    public ExampleComponent() {
        System.out.println("Instance of ExampleComponent: " + this.getClass());
    }

}
