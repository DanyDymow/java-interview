## @Order

Another common annotation is @TestMethodOrder. It allows you to specify the order in which test methods are called in a test class. It can be very useful when you know that method calls affect each other, but in a certain order everything should work as expected. Used quite often.

```java
@TestMethodOrder(OrderAnnotation.class)
public class OrderAnnotationUnitTest {

    @Test
    @Order(1)
    public void firstTest() {
    }

    @Test
    @Order(2)
    public void secondTest() {
    }
}
````