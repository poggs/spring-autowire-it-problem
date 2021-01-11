Spring @Autowire problem with integration tests
===============================================

This is a minimal project which has a single component, `ExampleComponent`, along with an integration test named `ExampleComponentIT`.

When executing the integration test using `mvn verify`, it fails with the following error:

```
org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'com.example.ExampleComponentIT': Unsatisfied dependency expressed through field 'exampleComponent'; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.example.ExampleComponent' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.example.ExampleComponent' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
```

Running the same integration test from within IntelliJ IDEA works successfully.