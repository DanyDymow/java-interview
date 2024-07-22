## @Value
The @Value annotation is needed to substitute dynamic values.

Let's imagine that in application.properties, or somewhere else in the settings files, we have the line plane.wingsCount=2. We made it in anticipation of the distant future, when Elon Musk comes up with airplanes with four wings, like in Star Wars. In a thousand years, we won’t even have the source code for this application, but it will be easy to correct the value in the properties file.

If you know what SpEL is, then you can use such a substitution even there. This is an important note because features that seem to complement each other do not always do so. Much more often they conflict with each other.

Constructor injection:
```java
Plane(@Value("${plane.wingsCount}") int wingsCount) {
    this.wingsCount = wingsCount;
}
```