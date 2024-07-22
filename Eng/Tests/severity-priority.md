## Severity vs Priority

Severity indicates the degree of damage that is caused to a project by the existence of a defect. Severity is exposed by the tester.

Defect Severity Gradation:

Blocking (S1 – Blocker)
Much of the functionality cannot be tested at all. A blocking error that renders the application inoperative, making further work with the system under test or its key functions impossible.
Critical (S2 – Critical)
a critical error, incorrectly functioning key business logic, a hole in the security system, a problem that led to a temporary crash of the server or rendered some part of the system inoperative, that is, an important part of one function does not work or a significant part does not work, but is available workaround (workaround/other entry points), allowing testing to continue.
Significant (S3 – Major)
An important part of one function/business logic does not work, but when specific conditions are met, either there is a workaround that allows you to continue testing it, or a not very significant part of a function does not work. Also refers to defects with high visibility - usually design defects that do not greatly affect functionality, but which, however, are immediately noticeable.
Minor (S4 – Minor)
often GUI errors that do not affect functionality but spoil usability or appearance. Also minor functional defects, or those that are reproducible on a specific device.
Trivial (S5 – Trivial)
Almost always there are defects in the GUI - typos in the text, font and shade mismatch, etc., or a poorly reproducible error that does not relate to business logic, a problem with third-party libraries or services, a problem that does not have any impact on the overall quality of the product.

Urgency shows how quickly the defect must be fixed. Priority is set by the manager, team lead or customer

Defect Priority gradation:

P1 High
Critical error for the project. Must be fixed as quickly as possible.
P2 Medium
This is not a critical error for the project, but requires a mandatory solution.
P3 Low
The presence of this error is not critical and does not require an urgent solution. Can be fixed when the team has time to fix it.