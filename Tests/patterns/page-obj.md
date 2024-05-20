## Page Object

- Page Object Model(Pattern)
The Page Object Model is a widely used object design pattern for structuring automation test code. Here, pages in the app are represented as Classes, and various UI elements of that pages are defined as variables. We already have gone through this technique in detail previously, so here we will discuss the abstract structure and explore how it can be implemented in a slightly different way or in a different programming language.


Page Object Model, also known as POM, is a design pattern in Selenium that creates an object repository for storing all web elements. It helps reduce code duplication and improves test case maintenance.

In Page Object Model, consider each web page of an application as a class file. Each class file will contain only corresponding web page elements. Using these elements, testers can perform operations on the website under test.
