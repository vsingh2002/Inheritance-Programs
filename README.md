# Inheritance in Java

Inheritance is a fundamental concept in Object-Oriented Programming (OOP). It allows one class to inherit the features (fields and methods) of another class, enabling reusability and better organization of code.

## Key Terminology

### 1. Super Class
The class whose features are inherited is known as the *super class* (also referred to as the base class or parent class).

### 2. Sub Class
The class that inherits another class is called the *sub class* (also known as the derived class, extended class, or child class). A subclass can add its own fields and methods in addition to the ones inherited from the superclass.

### 3. Reusability
Inheritance supports the concept of *reusability*, meaning you can create a new class based on an existing class to reuse its fields and methods, thereby reducing code duplication.

---

## Types of Inheritance in Java

### 1. Single Inheritance
- In single inheritance, a subclass inherits the features of one superclass.

### 2. Multilevel Inheritance
- In multilevel inheritance, a derived class inherits from a base class, and that derived class also acts as a base class for another class.

### 3. Hierarchical Inheritance
- In hierarchical inheritance, one class serves as a superclass for multiple subclasses.

### 4. Multiple Inheritance (Through Interfaces)
- Java allows multiple inheritance through interfaces. A class can implement multiple interfaces and inherit features from all of them.
- Note: Java does not support multiple inheritance with classes.

### 5. Hybrid Inheritance (Through Interfaces)
- Hybrid inheritance is a mix of two or more types of inheritance.
- Like multiple inheritance, hybrid inheritance is not supported with classes in Java but can be achieved through interfaces.

---

## Features of This Project

- *Implementation*: Demonstrates the key types of inheritance in Java with clear and concise examples.
- *Code Reusability*: Highlights how inheritance reduces code redundancy.
- *Structure*: Explains the relationship between superclass and subclass using practical code snippets.

---

## Project Structure

- SingleInheritance.java: Example of single inheritance.
- MultilevelInheritance.java: Example of multilevel inheritance.
- HierarchicalInheritance.java: Example of hierarchical inheritance.
- MultipleInheritance.java: Example of multiple inheritance using interfaces.
- HybridInheritance.java: Example of hybrid inheritance using interfaces.
