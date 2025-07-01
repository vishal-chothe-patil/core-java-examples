# java-keywords 🔑📘

This project demonstrates the usage of core Java keywords with clear coding examples. These keywords are the building blocks of Java programming and are used to control object behavior, memory usage, concurrency, and inheritance.
  - **Transient keyword**
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
