# Java Design Patterns Explained 🎯 

This project contains implementations and explanations of **commonly used design patterns** in Java. These patterns are crucial for building **robust**, **scalable**, and **maintainable** applications, especially in real-world domains like **FinTech, banking, and microservices**.

### 📦 Included Patterns:
- Builder Pattern  
- Singleton Pattern  
- Factory Pattern  
- Prototype Pattern


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

---


### Example: Factory Pattern – Payment Gateway Integration

#### 🔹 Step 1: Define Common Interface
  PaymentGateway → common interface

#### 🔹 Step 2: Implement Concrete Payment Providers
  Eg. RazorpayGateway, StripeGateway, PayPalGateway → implementations

#### 🔹 Step 3: Create the Factory Class
  PaymentGatewayFactory → selects and returns the correct implementation based on input

#### 🔹 Step 4: Use the Factory in Main Application
  Easy to add new gateways later without changing the core business logic.

Conclusion: The Factory Pattern simplifies payment provider integration. It enables dynamic selection of gateway logic and makes the code easier to maintain as new gateways (like PhonePe, Paytm) are added.

---

## 🔹 4. Prototype Pattern (Creational)

### 🔍 What is the Prototype Pattern?

The **Prototype Pattern** allows you to **clone existing objects** instead of creating new ones from scratch. It’s useful when object creation is **costly**, or when similar objects need to be created with slight variations.

---

### Why Use Prototype Pattern?

- Avoids expensive object creation  
- Supports cloning objects with different configurations  
- Helps in creating multiple similar objects quickly  
- Ideal when object initialization involves I/O, DB, or complex config

---

### Where It’s Used in FinTech?

- Cloning **loan document templates**
- Duplicating **financial contracts**
- Reusing **standard user onboarding forms**
- Generating **pre-filled reports**

---


### Example: Cloning a Loan Document Template

#### Step 1: Prototype Interface

  Defines a clone() method that all prototype-capable classes must implement.

  ```java
  public interface DocumentPrototype {
      DocumentPrototype clone();  // Clone method
  }
  ```
####  Step 2: Concrete Prototype Class

  Implements the clone() method to allow deep copying of a LoanDocument object.


#### Step 3: Client Code to Use Prototype

 Uses the clone() method to quickly create customized copies of loan documents for different customers.

---
###  Conclusion:
The Prototype Pattern is especially useful when you need to generate multiple documents or objects with the same structure but different values — commonly seen in FinTech apps that manage forms, contracts, and batch operations.
