Bean it is smallest class which is managed by spring container

### Scope
Singleton - default
Session - for each session
Request - each time as request
Prototype - each time as used

Если в singleton bean попробовать инициализировать prototype то он будет работать как singleton
```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class PrototypeBean {
    // Ваши поля и методы
}

@Component
class SingletonBean {

    private final PrototypeBean prototypeBean;

    @Autowired
    public SingletonBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
    }

    public PrototypeBean getPrototypeBean() {
        return prototypeBean;
    }
}
```
--------------------------------------

Использование @Lookup
С помощью аннотации @Lookup можно указать Spring, чтобы он каждый раз создавал новый экземпляр prototype бина:

```java
@Component
public class SingletonBean {

    public PrototypeBean getPrototypeBean() {
        return createPrototypeBean();
    }

    @Lookup
    protected PrototypeBean createPrototypeBean() {
        // Spring будет подставлять сюда новый экземпляр PrototypeBean
        return null;
    }
}
```

Использование ObjectFactory или Provider
Другой способ — использование ObjectFactory или Provider для создания нового экземпляра prototype бина:

```java
@Component
public class SingletonBean {

    @Autowired
    private ObjectFactory<PrototypeBean> prototypeBeanFactory;

    public PrototypeBean getPrototypeBean() {
        return prototypeBeanFactory.getObject();
    }
}
```
или с использованием javax.inject.Provider:

```java
import javax.inject.Provider;

@Component
public class SingletonBean {

    @Autowired
    private Provider<PrototypeBean> prototypeBeanProvider;

    public PrototypeBean getPrototypeBean() {
        return prototypeBeanProvider.get();
    }
}
````
Использование конфигурационного класса
Вы можете использовать конфигурационный класс для определения зависимости между singleton и prototype бинами:

```java
@Configuration
public class AppConfig {

    @Bean
    @Scope("singleton")
    public SingletonBean singletonBean() {
        return new SingletonBean();
    }

    @Bean
    @Scope("prototype")
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }
}
```

Внутри SingletonBean
```java
@Component
public class SingletonBean {

    @Autowired
    private ApplicationContext applicationContext;

    public PrototypeBean getPrototypeBean() {
        return applicationContext.getBean(PrototypeBean.class);
    }
}
```