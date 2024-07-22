## Mock Spy Stub

Stub: Used to replace real objects with simple objects that return fixed values.
Mock: Used to test interactions between objects and test method calls.
Spy: Used to partially replace the behavior of a real object with the ability to track method calls.

- Mocks - stub

Mocks help simulate and study outgoing interactions. That is, calls made by the system under test (SUT) to its dependencies to change their state.

Use Mock for:

checking the contract between the code under test and dependencies
checking that dependency methods are called the correct number of times
checking the correctness of the parameters with which the dependency code is called

-Stubs

Stubs help simulate incoming interactions. That is, calls made by the SUT to its dependencies to obtain input data.

Use Stub for:

providing predefined call results
perform predefined actions expected from dependencies, such as throwing exceptions

- Spies is generally a real object

Use Spy for:

testing legacy code that cannot be tested by other methods
checking that dependency methods are called the correct number of times
checking the correctness of the transmitted parameters
providing a predefined response from dependencies
perform predefined actions in response to calls to dependency methods