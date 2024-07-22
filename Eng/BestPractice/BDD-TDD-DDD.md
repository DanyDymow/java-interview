## Main purpose:

- TDD: The main purpose of TDD is to write tests for the code before writing it. A developer first writes tests that describe the expected behavior of the code, and then writes the minimum amount of code that is necessary to pass those tests.
- BDD: BDD focuses on defining the desired behavior of a system from a business perspective. He suggests using human-readable specifications to describe requirements, which are then translated into tests. BDD focuses on how a system should behave from the perspective of its users.
### Specification language:

- TDD: In TDD, tests are usually written using programming terms and focus on the functionality of the code.
- BDD: BDD specifications are written in natural language, closer to business terms. They are most often formulated as user stories and are used to discuss requirements with stakeholders.
### Abstraction level:

- TDD: TDD usually works at the level of individual methods or code modules. Tests verify that each piece of code works correctly in isolation.
- BDD: BDD works at a higher level, describing the behavior of the system as a whole or its components. Tests in BDD are focused on checking the functionality of the system from the user's point of view.
### Tools:

- TDD: TDD uses standard tools for writing and running tests, such as JUnit for Java or pytest for Python.
- BDD: BDD tests are usually written using specialized frameworks such as Cucumber or JBehave, which provide the ability to write specifications in natural language and automatically execute them.


## What is DDD

DDD is an approach that is aimed at studying the subject area of ​​an enterprise as a whole or some individual business processes. This is an excellent approach for projects in which the complexity (intricacy) of business logic is quite high. Its use is intended to reduce this complexity as much as possible.

Outside of the DDD approach, when a programmer writes code, he pays more attention to technologies and infrastructure, for example, how to send a message, how to receive it, encode it, save it to a database, which database.

The DDD approach suggests that all this, of course, is important, but secondary. Business is more important and should come first. And to make this whole thing work together, DDD teaches us (developers) to speak the same language with business. Not in a programming language, but in a business language. This is called a Ubiquitous language in DDD.