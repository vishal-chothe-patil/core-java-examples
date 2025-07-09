# Java Design Patterns Explained 🎯 

This project contains implementations and explanations of **commonly used design patterns** in Java. These patterns are crucial for building **robust**, **scalable**, and **maintainable** applications, especially in real-world domains like **FinTech, banking, and microservices**.

  -   Builder Pattern


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



