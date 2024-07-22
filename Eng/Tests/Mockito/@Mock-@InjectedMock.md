## @Mock

The @Mock annotation is used to create and implement a mock object. A mock is an object that simulates the actual behavior of an object, but in a simplified or controlled form. This is very useful when testing because it allows you to isolate the code that is being tested from the rest of the system.

@Mock example:

```java
@Mock
List mockedList;
```

## @InjectMocks
The @InjectMocks annotation is used to create an instance of a class and inject mocks created using the @Mock annotation into it. This makes it easy to integrate mocks into the class under test.

Example using @InjectMocks:

```java
@Mock
List mockedList;

@InjectMocks
ArrayList realList;
```
This example creates an actual ArrayList object and injects a list layout into it. This allows you to test a real object using a mockup.