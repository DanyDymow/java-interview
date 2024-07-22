## Kubernetes probes
— These are checks that are carried out during the life cycle of the POD. They are described for each POD container. There are three types of checks.
Startup probe - runs immediately after POD starts and is used for applications that have a long initialization procedure. Until it is completed, no other probes are run.
Readiness probe — checks the POD’s readiness to process traffic (POD is not added to traffic routing in service if this test fails).
Liveness probe - checks whether the application is functioning (if the test is not successful, the process in the POD container is restarted).

There are exec-, http-, tcp- and gprc-probes. Checks are performed by the kubelet service on the node where the target POD is running.