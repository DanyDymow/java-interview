## verifyNoMoreIteractions
Checks that no other methods have been called

```java
@After
    public void resetMockStructuredLogger() {
        try {
            // Проверка, не осталось ли непровернного взаимодействия с моком
            verifyNoMoreInteractions(mockStructuredLogger);
        } finally {
            // На всякий случай, сброс состояния мока, потому как ошибки падают каскадно...
            reset(mockStructuredLogger);
        }
    }
```