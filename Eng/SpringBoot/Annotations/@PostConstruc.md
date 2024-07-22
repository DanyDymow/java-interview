## @PostContruct

The @PostConstruct annotation is used to denote a method that must be executed immediately after the object is created and the constructor has completed, but before the object is used. It is important to understand that this method is executed only once during the object's lifecycle


The main advantage of using @PostConstruct instead of initializing in a constructor is that @PostConstruct is guaranteed to be called after all dependencies have been injected into the bean.

In the case of a constructor, it is not always guaranteed that all dependencies are already injected into the object at the time of its creation. This may cause errors if these dependencies are used during the initialization process.

Thus, @PostConstruct ensures safe initialization of an object after it is created and all dependencies are injected, making it a useful tool in various frameworks such as Spring or Java EE.