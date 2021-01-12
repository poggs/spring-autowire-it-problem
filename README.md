Spring @Autowire problem with integration tests
===============================================

This is a minimal project which has a single component, `ExampleComponent`, along with an integration test named `ExampleComponentIT`.

The `showBeans` test method will dump the beans found.  When run with `mvn verify`, it will output:

```
org.springframework.context.annotation.internalConfigurationAnnotationProcessor
org.springframework.context.annotation.internalAutowiredAnnotationProcessor
org.springframework.context.event.internalEventListenerProcessor
org.springframework.context.event.internalEventListenerFactory
integrationTestContext
```

It will then fail as `ExampleComponent` has been annotated with `@Autowired(required = false)` and `exampleComponentTest` tests that `exampleComponent` is not null.

It will not find the `ExampleComponent`.   Running `ExampleComponentIT` from within IntelliJ IDEA will find the `exampleComponent` bean.
