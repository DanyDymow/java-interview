## ParametrizedTest

Аннотация для создания теста который использует разные данные для проверки

```java
@ParameterizedTest
@CsvSource({ "0,0:00", "10,0:10", "60,1:00", "95,1:35" })
@DisplayName("Duration to Length")
void variousSongDurationTests(int durationSeconds, String songLength) {
   var song = SongPersist.builder()
           .duration(Duration.ofSeconds(durationSeconds))
           .build();

   var converter = new DurationToLengthConverter(song);

   Assertions.assertEquals(songLength, converter.length());
```

Возможен вариант объектов в параметры
```java
public static Stream<Arguments> songAndLength() {
   return Stream.of(
           Arguments.of(SongPersist.builder()
                           .duration(Duration.ofSeconds(0))
                           .build(), "0:00"),
           Arguments.of(SongPersist.builder()
                           .duration(Duration.ofSeconds(178))
                           .build(), "2:58"),
           Arguments.of(SongPersist.builder()
                           .duration(Duration.ofSeconds(10))
                           .build(), "0:10")
   );
}

@ParameterizedTest
@MethodSource("songAndLength")
@DisplayName("Duration to Length")
void variousSongDurationTests(SongPersist songPersist, String songLength) {
   var converter = new DurationToLengthConverter(songPersist);

   Assertions.assertEquals(songLength, converter.length());
}
```

Можно так же использовать аннотацию @MethodSourse

```java
class SongAddRequestTest {

   private Validator validator;

   @BeforeEach
   public void setup() {
       validator = Validation.buildDefaultValidatorFactory().getValidator();
   }

   public static Stream<String> validTimeLength() {
       return Stream.of("0:00", "10:10", "60:00", "0:70", "100:00");
   }

   @ParameterizedTest
   @MethodSource("validTimeLength")
   public void testValidTimeLengthSongAddRequest(String timeLength) {
       // Создаем экземпляр SongAddRequest с валидными значениями
       var songAddRequest = new SongAddRequest("Title", "Author", timeLength, "Genre");

       // Проверяем, что валидация проходит успешно
       Set<ConstraintViolation<SongAddRequest>> violations = validator.validate(songAddRequest);
       assertTrue(violations.isEmpty());
   }
}
```