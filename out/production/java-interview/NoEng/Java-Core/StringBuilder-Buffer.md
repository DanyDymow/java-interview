## StringBuffer Class	
- StringBuffer is present in Java.	
- StringBuffer is synchronized. This means that multiple threads cannot call the methods of StringBuffer simultaneously.
- Due to synchronization, StringBuffer is called a thread safe class.
- Due to synchronization, StringBuffer is lot slower than StringBuilder
## StringBuilder Class
- StringBuilder was introduced in Java 5.
- StringBuilder is asynchronized. This means that multiple threads can call the methods of StringBuilder simultaneously.
- Due to its asynchronous nature, StringBuilder is not a thread safe class.
- Since there is no preliminary check for multiple threads, StringBuilder is a lot faster than StringBuffer.