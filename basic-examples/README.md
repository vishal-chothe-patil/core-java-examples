# Hello World - Basic Syntax Example in Java 👋 

This is a simple Java program that prints `"Hello, World!"` to the console.  
It serves as the traditional starting point for learning any programming language, including Java.

---

## What This Example Covers

- Basic structure of a Java program
- `main()` method as the entry point
- Use of `System.out.println()` for output
- How to define a class in Java

---

## Program Code

  ```java
  public class HelloWorld {
      public static void main(String[] args) {
          System.out.println("Hello, World!");
      }
  }
  ```

---

## Explanation 📄 

### `public class HelloWorld`

- Defines the class with the name `HelloWorld`.
- The class name **must match** the filename: `HelloWorld.java`.

### `public static void main(String[] args)`

- Entry point of any Java application.
- The **Java Virtual Machine (JVM)** looks for this method to start program execution.

### `System.out.println("Hello, World!");`

- Prints the message to the console.
- `System.out` is a **built-in output stream** used to display messages to the standard output (usually the terminal).
