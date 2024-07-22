## @Qualifier
## @Primary

@Qualifier позволяет выбрать бин по имени или другому идентификатору, в то время как @Primary позволяет указать предпочтительный бин. Эти аннотации полезны в сложных приложениях, где есть несколько бинов с одинаковым типом и необходимо указать, какой из них использовать

Квалификаторы используются, когда Spring не может телепатически понять, какой класс внутри сложной иерархии использовать для подстановки.

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