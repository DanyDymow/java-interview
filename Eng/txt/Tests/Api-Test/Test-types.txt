## What types and types of testing are used in API testing?

- Functional testing: most of the API tests deal specifically with the functionality of the application, what the application should do (functional test cases).
- Manual testing: although API tests are now largely automated, this does not mean that there are no manual tests at all, for example in Postman.
- Automated testing: API test cases are automated and appropriate frameworks are applied.
- Load testing: traffic to the API is emulated and problem areas are studied; Without this, it can be difficult to predict what API problems might arise under heavy load. Tools (usually JMeter) are used to send HTTP requests to API endpoints and measure response time, error rates, and other metrics.
- Security testing: checking the security of the API from external threats, verifying the strength of encryption, and the overall stability of the API architecture; also control access levels and authorization details.
- In particular, penetration testing (API pentest): security specialists, unfamiliar with the API, try to evaluate the strength by simulating the behavior of an attacker.