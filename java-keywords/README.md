# java-keywords 🔑📘

This project demonstrates the usage of core Java keywords with clear coding examples. These keywords are the building blocks of Java programming and are used to control object behavior, memory usage, concurrency, and inheritance.
  - **Transient keyword**
  - **Volatile keyword**
  - **Synchronized keyword**

---

## 🔸 1. `transient` Keyword

### What is `transient-keyword`?
`transient` is used to prevent a variable from being serialized when an object is saved to a file or sent over a network.

### Why we use `transient`?
When we want to **skip sensitive or unnecessary fields** (like passwords, tokens, cache) during object serialization.

### Where to apply?
In Java applications involving:
- File I/O with `ObjectOutputStream`
- Data transfer between systems (serialization)

### Example of `transient` Keyword
  ```java
  public class TransientExample implements Serializable {
      String name;
      transient String password; // this will not be saved in file
  }
  ```

---

### 🔸 2. `volatile` Keyword

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

### ✅ What is `synchronized-keyword` ?
`synchronized` provides **mutual exclusion**, allowing only **one thread at a time** to access a method or a block of code.

### 🛠️ Why we use `synchronized`?
To prevent **race conditions** when multiple threads access and modify shared resources simultaneously.

### 📦 Where to apply?
- Banking applications (e.g., updating account balances)
- Shared in-memory caches
- Messaging queues and thread-safe data structures

### 💡 Example of `synchronized` Keyword
```java
public synchronized void increment() {
    count++;
}
```
