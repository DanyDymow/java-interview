```java
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Source.class) // Подключение к каналу сообщений
public class KafkaStreamProducer {

    private final Source source;

    public KafkaStreamProducer(Source source) {
        this.source = source;
    }

    public void sendMessage(String message) {
        Message<String> msg = MessageBuilder.withPayload(message).build();
        source.output().send(msg); // Отправка сообщения в Kafka
    }
}
```