## @Import
## @ImportResource("classpath:/LockheedMartin.xml")
## @PropertySource("classpath:/Tesla.properties")
По-умолчанию подразумевается, что Spring ищет ваши компоненты в каких-то заранее заданных пакетах. Он ищет там классы @Configuration и инициализирует их.

Но вы можете использовать @Configuration и без необходимости сканирования кучи ненужных директорий. Достаточно импортировать их вручную.
```java
@Import(LockheedMartin.class)
class PlaneFactoryConfig {}
```