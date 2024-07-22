### New: 
In this state, an object of the Thread class is created using the new operator, but the thread does not exist. The thread is not started until we call the start() method.

### Runnable: 
In this state, the thread is ready to be executed after the start() method is called. However, it has not yet been selected by the thread scheduler.

### Running: 
In this state, the thread scheduler selects the thread from the ready state, and it runs.

### Waiting/Blocked: 
In this state, the thread is not running but is still alive or waiting for the completion of another thread.

### Dead/Terminated: 
Upon exiting the run() method, the thread is in a terminated or dead state.






