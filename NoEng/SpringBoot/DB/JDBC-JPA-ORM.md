- **JDBC is a standard for Database Access**


JDBC is a standard for connecting to a DB directly and running SQL against it - e.g SELECT * FROM USERS, etc. Data sets can be returned which you can handle in your app, and you can do all the usual things like INSERT, DELETE, run stored procedures, etc. It is one of the underlying technologies behind most Java database access (including JPA providers).

One of the issues with traditional JDBC apps is that you can often have some crappy code where lots of mapping between data sets and objects occur, logic is mixed in with SQL, etc.

- **JPA is a standard for ORM**
JPA is a standard for Object Relational Mapping. This is a technology which allows you to map between objects in code and database tables. This can "hide" the SQL from the developer so that all they deal with are Java classes, and the provider allows you to save them and load them magically. Mostly, XML mapping files or annotations on getters and setters can be used to tell the JPA provider which fields on your object map to which fields in the DB. The most famous JPA provider is Hibernate, so it's a good place to start for concrete examples.

Other examples include OpenJPA, toplink, etc.

Under the hood, Hibernate and most other providers for JPA write SQL and use JDBC to read and write from and to the DB.

- **ORM**
Object–relational mapping (ORM, O/RM, and O/R mapping tool) in computer science is a programming technique for converting data between a relational database and the heap of an object-oriented programming language. This creates, in effect, a virtual object database that can be used from within the programming language.