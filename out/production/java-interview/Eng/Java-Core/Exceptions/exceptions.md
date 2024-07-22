## Exceptions

## Errors
Errors are more serious problems that, according to the Java specification, should not be handled in a native program because they involve JVM-level problems. For example, exceptions of this kind occur if the memory available to the virtual machine has run out.

## Class Throwable

The Throwable class is the top of all exceptions

## Exceptions
are the result of problems in the program that are in principle solvable, predictable and the consequences of which can be eliminated within the program. For example, an integer was divided by zero.

### Checked
Caught by try\catch\finally or declared in method using throws

Checked exceptions are exceptions that are checked at compile-time.
- IOException (input output)
- SQLException 
- FileNotFound 

### Unchecked
Don't need to be caught

Unchecked exceptions, also known as runtime exceptions, are not checked at compile-time.

- NullPointer
- ArrayIndexOutOf
- Arithmetic
- OutOfMemoryError

(ArithmeticException, ClassCastException, ConcurrentModificationException, IllegalArgumentException, IllegalStateException, IndexOutOfBoundsException, NoSuchElementException, NullPointerException, UnsupportedOperationException)
```java
import java.io.*;
class Example_Throw {
    //declare exception using throws in the method signature
    void testMethod(int num) throws IOException, ArithmeticException{
        if(num==1)
            throw new IOException("IOException Occurred");
        else
            throw new ArithmeticException("ArithmeticException");
    }
}class Main{
    public static void main(String args[]){
        try{
            //this try block calls the above method so handle the exception
            Example_Throw obj=new Example_Throw();
            obj.testMethod(1);
        }catch(Exception ex){
            System.out.println(ex);
        }finally {
            System.out.println('Done');
        }
    }
}
```

### How does JVM handle exceptions?
As soon as an exception is created somewhere, the runtime creates an Exception Object (let's denote it as ExcObj). It contains all the necessary information for processing - the exception itself, the place where it was called, and where it occurred.
Creating ExcObj and passing it to the runtime is nothing but "throwing an exception".

ExcObj contains methods through which you can trace the location of the exception creation. This set of methods is called the Call Stack.

Next, the runtime system looks for a method in the Call Stack that can handle our exception.

If it finds a corresponding handler, meaning the exception type matches the type in the handler, everything is fine.

If it doesn't find one, the runtime passes everything to the default exception handler, which prepares a response and terminates the operation.