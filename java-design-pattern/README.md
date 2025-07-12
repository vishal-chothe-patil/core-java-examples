# Java Design Patterns Explained 🎯 

This project contains implementations and explanations of **commonly used design patterns** in Java. These patterns are crucial for building **robust**, **scalable**, and **maintainable** applications, especially in real-world domains like **FinTech, banking, and microservices**.

  -   Builder Pattern
  -   Singleton Pattern
  -   Factory Pattern  


## What Are Design Patterns? 

**Design Patterns** are proven solutions to common software design problems. They provide a **standard approach** to writing maintainable, scalable, and reusable code.

> Think of them as best practices and templates used by developers to solve recurring problems in software design.

---

## Why Use Design Patterns?

- Reusability of code and solutions  
- Loose coupling between components  
- Improved code **readability** and **maintainability**  
- Helps in designing **scalable** and **robust** systems  
- Industry-standard knowledge for interviews and clean architecture

---

## Types of Design Patterns 🏗️ 

Design Patterns fall into **three main categories**:

| Category       | Description                                   |
|----------------|-----------------------------------------------|
| Creational     | Deals with object creation mechanisms         |
| Structural     | Deals with object composition                 |
| Behavioral     | Deals with object interaction and responsibility |

---

---

## 🔹 1. Builder Pattern (Creational)

### What is the Builder Pattern?

The **Builder Pattern** is used to construct a complex object step-by-step. It separates the construction logic from the object’s representation, allowing the same construction process to create different representations.

### Why Use It?

- Handles complex objects with many optional fields
- Avoids telescoping constructors (too many parameters)
- Makes the code more readable and maintainable
- Useful for creating immutable objects with varying configurations

### Where It’s Used in FinTech?

- Loan applications with various fields (tenure, amount, documents, etc.)
- Complex reports or export requests (CSV, PDF)
- Insurance form builders, customer profile setup

---

### Example Usage (Java)

  ```java
   public class LoanApplicationBuilderPatternExaxmple {
      public static void main(String[] args) {
          LoanApplication loan = new LoanApplication.Builder("Vishal Chothe", 50000)
                  .tenureMonths(24)
                  .interestRate(9.5)
                  .employmentType("Self-Employed")
                  .documentProof("PAN Card")
                  .build();
  
          System.out.println(loan);
      }
  }
  ```
---

## 🔹 2. Singleton Pattern

### What is the Singleton Pattern?

The **Singleton Pattern** ensures that a class has **only one instance** throughout the application's lifecycle and provides a **global access point** to it. It is especially useful for managing **shared resources** like database connections, file handlers, or configuration managers.

---

### Why Use Singleton?

- Ensures a **single instance** of a class is created
- Saves memory and improves performance
- Provides **global, consistent access** to shared components
- Prevents issues caused by multiple instances (e.g., conflicting DB connections)

---

### Where It's Used in FinTech?

- **Database connection manager** (MySQL, MongoDB, etc.)
- **File logger** for auditing/reporting
- **Configuration loader** for secure credentials and environment variables

---

## Example 1: Singleton – Database Connection

  ```java
  public class DatabaseConnection {
  
      // Static instance (shared)
      private static DatabaseConnection instance;
  
      // Private constructor to prevent external instantiation
      private DatabaseConnection() {
          System.out.println("Connected to FinTech DB");
      }
  
      // Thread-safe global access method
      public static synchronized DatabaseConnection getInstance() {
          if (instance == null) {
              instance = new DatabaseConnection(); // Created only once
          }
          return instance;
      }
  
      public void query(String sql) {
          System.out.println("Executing SQL: " + sql);
      }
  }
  ```
### ▶️ Usage:
  ```java
  public class Main {
      public static void main(String[] args) {
          DatabaseConnection db1 = DatabaseConnection.getInstance();
          db1.query("SELECT * FROM loan_applications");
  
          DatabaseConnection db2 = DatabaseConnection.getInstance();
          db2.query("SELECT * FROM emi_payments");
  
          System.out.println("Same DB instance? " + (db1 == db2));  // true
      }
  }
  ```
---

### Example 2: Singleton – File Logger

Conclusion: Singleton ensures a consistent, memory-efficient way to manage shared resources—making it ideal for core FinTech services like DB handling, logging, and configuration.

---

## 🔹 3. Factory Pattern

### What is the Factory Pattern?

The **Factory Pattern** provides a way to **create objects without exposing the instantiation logic** to the client. Instead of using `new` directly, the client calls a method (usually `getInstance()` or `create()`) which returns the appropriate subclass or implementation.

---

### Why Use Factory Pattern?

- **Encapsulates object creation logic**
- Promotes **loose coupling** between classes
- Makes code **extensible and flexible**
- Helps in managing **multiple implementations of a common interface**

---

### Where It's Used in Project?

- Selecting **payment gateways** (e.g., Razorpay, Stripe, PayPal)
- Choosing **loan evaluation strategies** (e.g., RiskBased, AutoApproved, Manual)
- Generating **different types of financial reports** (e.g., Monthly, Annual, Summary)

