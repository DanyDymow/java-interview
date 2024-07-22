## @Qualifier
## @Primary

@Qualifier allows you to select a bean by name or other identifier, while @Primary allows you to specify a preferred bean. These annotations are useful in complex applications where there are multiple beans of the same type and you need to specify which one to use

Qualifiers are used when Spring cannot telepathically understand which class within a complex hierarchy to use for substitution.

```java
class FighterPlane implements Plane {}

class CivilPlane implements Plane {}
```

Инъекция в конструктор (constructor injection):
```java
@Autowired
ElonMusk(@Qualifier("figherplane") Plane plane) {
    this.plane = plane;
}
```
Инъекция в сеттер (setter injection):
```java
@Autowired
void setPlane(@Qualifier("figherplane") Plane plane) {
    this.plane = plane;
}
```
Можно сделать и по-другому:
```java
@Autowired
@Qualifier("figherplane")
void setPlane(Plane plane) {
    this.plane = plane;
}
```
Инъекция в поле (field injection):
```java
@Autowired
@Qualifier("figherplane")
Plane plane;
```