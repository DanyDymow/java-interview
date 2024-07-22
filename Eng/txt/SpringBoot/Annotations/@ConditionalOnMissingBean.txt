## How to Tell an Auto-Configuration to Back Away When a Bean Exists?
To instruct an auto-configuration class to back off when a bean already exists, we can use the @ConditionalOnMissingBean annotation.

The most noticeable attributes of this annotation are:

value – the types of beans to be checked
name – the names of beans to be checked
When placed on a method adorned with @Bean, the target type defaults to the method’s return type:

```java
@Configuration
public class CustomConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public CustomService service() { ... }
}
```
