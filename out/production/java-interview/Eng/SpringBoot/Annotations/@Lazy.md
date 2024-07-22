## @Lazy
**Spring 3.0**
By default, Spring creates beans proactively. When we build an airplane, the wings and landing gear must be ready. However, if you want to eat on the plane, you should not heat up the kebab in advance, while still on the ground. By the time you fly, it will already have cooled down.

Depending on which element (i.e., along with which annotations) you use @Lazy, the result will be different.

By attaching it to the @Bean factor method, you will defer the method call, i.e. creating a bean.
If you hang it higher, on the entire @Configuration, then this will affect all beans inside the configuration.
A class marked as @Component but not in the configuration will lazily initialize on its own.
If we mark the injection sites (marked with the @Autowired annotation on the constructor, setter or field), then a temporary dynamic proxy will be created. Such a dependency will be initialized lazily, even if it was not originally intended to be initialized.
Lazyness can be turned on and off: @Lazy has a value parameter that defaults to true. Let's prepare food already in flight:

```java
@Configuration
@Lazy
class PlaneConfig {

    @Bean
    @Lazy(false)
    Food food() {
        return new Food();
    }
}
```