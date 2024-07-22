## Component

@Component is one of the basic annotations in the Spring Framework, which is used to indicate that a class is a component and should be automatically configured and injected into the Spring container as a bean. Here are the main aspects of the @Component annotation:

Creating a component:
Classes marked with the @Component annotation are considered components in Spring applications. These can be any classes representing services, repositories, utilities and other application components.
Scan components:
The Spring Framework automatically scans and detects classes marked with the @Component annotation as part of a component's configuration (component scanning). By default, scanning occurs in the package where the application configuration class is located.
Bean registration:
When beans are discovered, they are registered in the Spring container as beans. This means that they are made available for use by other components in the application and can be injected into other classes.
Bean name:
By default, the bean name is generated based on the class name, but it can be explicitly set using the value attribute of the @Component annotation. For example: @Component("myComponent").
Extended Annotations:
There are also more specialized annotations that are a subset of @Component, such as @Service, @Repository, @Controller, which add semantic meaning and are used to separate components by their functionality.
Dependency injection:
Components marked with the @Component annotation can be injected into other components using Spring's dependency injection mechanism, such as the @Autowired annotation.
Bean life cycle:
By default, beans registered with the @Component annotation are created as a singleton and their lifecycle is managed by the Spring container.