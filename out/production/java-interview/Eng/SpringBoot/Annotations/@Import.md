## @Import
## @ImportResource("classpath:/LockheedMartin.xml")
## @PropertySource("classpath:/Tesla.properties")
By default, it is assumed that Spring looks for your components in some predefined packages. It looks for @Configuration classes there and initializes them.

But you can use @Configuration without having to scan a bunch of unnecessary directories. It is enough to import them manually.
```java
@Import(LockheedMartin.class)
class PlaneFactoryConfig {}
```