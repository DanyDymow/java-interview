## doReturn() 

suitable for use with spies, as it prevents execution of the real method and unwanted side effects. At the same time, when() is preferable for use with mocks. Sometimes doReturn() is used when there is a need to avoid the possibility of an exception in a method.

```java

// Используем doReturn() для безопасности
doReturn("safe").when(spyList).get(0);

// Предпочитаем использовать when() в обычной ситуации
when(mockList.get(0)).thenReturn("standard");
```

Working with void methods and spies
Using doReturn() is justified when you need to stabilize a void method or work with a Mockito spy. This allows you to get rid of the execution of the real method and its unwanted consequences.

```java
// Создаем заглушку для void метода на профессиональном уровне
doReturn().when(spyList).clear();

// Этот код вызовет исключение UnnecessaryStubbingException
// doNothing().when(spyList).clear();
```