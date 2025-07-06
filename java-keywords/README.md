# java-keywords 🔑📘

This project demonstrates the usage of core Java keywords with clear coding examples. These keywords are the building blocks of Java programming and are used to control object behavior, memory usage, concurrency, and inheritance.
  - **Static Keyword**
  - **Final Keyword**
  - **Transient keyword**
  - **Volatile keyword**
  - **Synchronized keyword**
    
---

## 🔸 1. `static` Keyword

### What is `static` Keyword?
The `static` keyword in Java indicates that a **field, method, or nested class belongs to the class** itself rather than instances of the class.

This means:
- Only one copy exists, shared across all instances.
- Can be accessed without creating an object of the class.

---

### Why we use `static`?

- Shared counters or tracking data (e.g., number of objects created)
- Utility/helper methods (e.g., `Math.pow()`)
- Constants (`static final`) used across the application
- Memory optimization by avoiding duplicate values in every instance

---

### Where to apply?

- Singleton services or classes
- Utility/helper classes (e.g., `StringUtils`, `FileUtils`)
- Logging frameworks (e.g., `LoggerFactory`)
- Shared config or metadata
- Static factory methods

---

### Example of `static` Keyword

  ```java
  
  public class StaticExample {
  
      // Static variable: shared among all instances
      static int count = 0;
  
      // Static constant
      static final String COMPANY_NAME = "KillerExpertise";
  
      // Static method: can be called without object
      public static void showCount() {
          System.out.println("Total objects created: " + count);
      }
  
      // Static nested class
      static class Helper {
          public void printHelperMessage() {
              System.out.println("This is a static inner class.");
          }
     }
  }
  ```
---

## 🔸 2. `final` Keyword

### What is `final`?
The `final` keyword in Java is used to:
- Declare **constants**
- Prevent **method overriding**
- Prevent **class inheritance**
- Prevent **reassignment** of variables or method parameters

---

### Why we use `final`?

- To make variables **constant and unchangeable**
- To protect methods from being **overridden** in subclasses
- To prevent important utility or config classes from being **extended**
- To make method parameters **immutable**, ensuring thread-safety and predictable behavior

---

### Where to apply?

- Constants and configuration values  
  *(e.g., `final int MAX_USERS = 100;`)*
- Core or security logic methods that should not be overridden  
  *(e.g., authentication, audit logs)*
- Helper or utility classes  
  *(e.g., `final class StringUtils`)*
- Lambda parameters or thread-safe variables

---

### Example of Final Keyword

  ```java
  // Final variable - cannot be reassigned
  final int MAX_USERS = 100;
  
  // Final method - cannot be overridden
  public final void logInfo() {
      System.out.println("Logging securely...");
  }
  
  // Final class - cannot be extended
  final class Constants {
      public static final String APP_NAME = "KeywordApp";
  }
  
  // Final method parameter - cannot be modified inside the method
  public void printDetails(final String name) {
      System.out.println("User: " + name);
      // name = "Another"; // ❌ Error: cannot modify final parameter
  }
  ```
---

## 🔸 3. `transient` Keyword

### What is `transient-keyword`?
`transient` is used to prevent a variable from being serialized when an object is saved to a file or sent over a network.

---

### Why we use `transient`?
When we want to **skip sensitive or unnecessary fields** (like passwords, tokens, cache) during object serialization.

---

### Where to apply?
In Java applications involving:
- File I/O with `ObjectOutputStream`
- Data transfer between systems (serialization)

---

### Example of `transient` Keyword
  ```java
  public class TransientExample implements Serializable {
      String name;
      transient String password; // this will not be saved in file
  }
  ```
---

### 🔸 4. `volatile` Keyword

#### What is `volatile-keyword`?
The `volatile` keyword ensures that changes made to a variable by one thread are **immediately visible** to all other threads. It tells the JVM **not to cache the value** and always read it from main memory.

---

#### Why we use `volatile`?
To prevent **thread-local caching** in multi-threaded environments. Without `volatile`, one thread may not see the most recent value updated by another thread.

---

#### Where to apply?
- Shared flags between threads
- Status checkers and stop signals
- Real-time game state or toggles
- Reader threads watching writer threads

---

#### Example of `volatile` Keyword

  -  The volatile keyword ensures that the worker thread sees the updated value of running as soon as the main thread sets it to false.
  ```java
  public class VolatileExample {
      private volatile boolean running = true;
    }
  ```
---
## 🔸 5. `synchronized` Keyword

### What is `synchronized-keyword` ?
`synchronized` provides **mutual exclusion**, allowing only **one thread at a time** to access a method or a block of code.

---

### Why we use `synchronized`?
To prevent **race conditions** when multiple threads access and modify shared resources simultaneously.

---

### Where to apply?
- Banking applications (e.g., updating account balances)
- Shared in-memory caches
- Messaging queues and thread-safe data structures

---

### Example of `synchronized` Keyword
```java
public synchronized void increment() {
    count++;
}
```
