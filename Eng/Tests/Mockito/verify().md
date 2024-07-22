## Verify
To verify that a method has not been called, you can use the Mockito library and its verify() method. This method is used to verify that a certain behavior has occurred.

In this case, we need to check that the someMethod() method has not been called even once. This can be done using the verify() method and the never() constant. This is what it will look like:

```java
public class FooTest {
    @Test
    public void testBarMethod() {
        Dependency dependency = Mockito.mock(Dependency.class);
        Foo foo = new Foo(dependency);
        foo.bar();
        Mockito.verify(dependency, Mockito.never()).someMethod();
    }
}
```