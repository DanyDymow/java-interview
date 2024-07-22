## @Profile
Sometimes we want to have different sets of settings. The settings differ for a test environment and for a production environment, for the cloud and for your own hardware, and so on.

```java
@Component
@Profile("test")
class FigherJet implements Vehicle {}
```