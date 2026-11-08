# Assignment 6 — Visitor Pattern
## Zoo Management System

### Project Description
This project demonstrates the Visitor Design Pattern in Java.
It manages zoo animals and performs different operations without modifying animal classes.

### Pattern Components
- Element Interface: Animal
- Concrete Elements: Lion, Elephant
- Visitor Interface: AnimalVisitor
- Concrete Visitors: HealthCheckVisitor, FeedingPlanVisitor
- Object Structure: Zoo
- Client: Main

### Double Dispatch
Each animal implements accept() and calls the matching visit method.
This allows the correct visitor operation to be selected without instanceof or type-checking chains.

### Clean Code Principles
1. Meaningful Names — classes have clear names.
2. Single Responsibility — each visitor performs one operation.
3. Encapsulation — animal fields are private.
4. Polymorphism — animals implement the same interface.
5. Open/Closed Principle — new visitors can be added without changing animal classes.
6. Separation of Concerns — animal data and visitor operations are separated.

### How to Run
Run Main.java.