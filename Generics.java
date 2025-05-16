package Module14;

/*1. What is a generic?
A generic in Java allows you to write code that works with different data types while providing type safety at compile time.

Example:

java
Copy
Edit
ArrayList<String> list = new ArrayList<String>();
Here, ArrayList is a generic class. The <String> part tells the compiler that this list will only hold String objects, avoiding runtime errors like inserting integers.

2. In which situation/set-up is recursion best avoided?
Recursion is best avoided when:

The depth of recursion is large, which can lead to a stack overflow error.

The problem can be solved more efficiently with iteration, especially in simple loops.

You need to optimize performance, as recursion often has overhead from repeated function calls.


3. When would we prefer throwable over try/catch?
You would prefer throwing a Throwable (or a subclass like Exception) over using try/catch when:

You want to let the calling method handle the error, rather than handling it immediately.

You’re writing a library method or API where error handling should be delegated to the caller.

You’re rethrowing an exception to add context or to transform it into a custom exception.

Here, you're not using try/catch, but declaring throws IOException so the caller is responsible.

Use try/catch when:

You can recover from the error at that point.

You want to log the error or take alternate action. */


