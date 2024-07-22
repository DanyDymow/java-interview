## Exceptions

## Errors 
Ошибки (Errors) представляют собой более серьёзные проблемы, которые, согласно спецификации Java, не следует обрабатывать в собственной программе, поскольку они связаны с проблемами уровня JVM. Например, исключения такого рода возникают, если закончилась память доступная виртуальной машине.

## Class Throwable 

Класс Throwable является верхушкой всех exceptions

## Исключения (Exceptions) 
являются результатом проблем в программе, которые в принципе решаемы, предсказуемы и последствия которых возможно устранить внутри программы. Например, произошло деление целого числа на ноль.

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