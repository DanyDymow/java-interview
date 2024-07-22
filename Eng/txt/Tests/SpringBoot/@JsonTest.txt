## Тестирование сериализации JSON с помощью @JsonTest
Next comes an even more unknown test fragment annotation that helps test JSON serialization: @JsonTest

What is included in the Spring Test context: @JsonComponent, ObjectMapper, Jackson Module or similar components when using JSONB or GSON.

What is not part of the Spring Test context: @Service, @Component, @Controller, @Repository

If you have more complex serialization logic for your Java classes or use multiple Jackson annotations:

```java
public class PaymentResponse {
 
  @JsonIgnore
  private String id;
 
  private UUID paymentConfirmationCode;
 
  @JsonProperty("payment_amount")
  private BigDecimal amount;
 
  @JsonFormat(
    shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd|HH:mm:ss", locale = "en_US")
  private LocalDateTime paymentTime;
 
}
```
Вы можете использовать этот тестовый фрагмент для проверки сериализации JSON вашего приложения Spring Boot:

```java
@JsonTest
class PaymentResponseTest {
 
  @Autowired
  private JacksonTester<PaymentResponse> jacksonTester;
 
  @Autowired
  private ObjectMapper objectMapper;
 
  @Test
  public void shouldSerializeObject() throws IOException {
 
    assertNotNull(objectMapper);
 
    PaymentResponse paymentResponse = new PaymentResponse();
    paymentResponse.setId("42");
    paymentResponse.setAmount(new BigDecimal("42.50"));
    paymentResponse.setPaymentConfirmationCode(UUID.randomUUID());
    paymentResponse.setPaymentTime(LocalDateTime.parse("2020-07-20T19:00:00.123"));
 
    JsonContent<PaymentResponse> result = jacksonTester.write(paymentResponse);
 
    assertThat(result).hasJsonPathStringValue("$.paymentConfirmationCode");
    assertThat(result).extractingJsonPathNumberValue("$.payment_amount").isEqualTo(42.50);
    assertThat(result).extractingJsonPathStringValue("$.paymentTime").isEqualTo("2020-07-20|19:00:00");
    assertThat(result).doesNotHaveJsonPath("$.id");
  }
}
```