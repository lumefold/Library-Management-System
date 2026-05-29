# Library Management System (MVP)

A cohesive, production-ready console application built in Java to demonstrate core Object-Oriented Programming (OOP) concepts. This project serves as a Minimum Viable Product (MVP) fulfilling the requirements for the final OOP development assignment.

---

##  Project Overview
The **Library Management System** models a real-world library infrastructure containing various types of resources (Books and Magazines). The system showcases safe data management, resource extension through hierarchies, and runtime decision-making via dynamic polymorphism.

### Key Features
* **Abstract Asset Architecture:** Employs a robust base layer preventing instantiation of generic library items.
* **Data Integrity Protection:** Enforces input validation across all resource mutators (setters).
* **Heterogeneous Inventory Management:** Manages multiple asset variants inside a unified, dynamic collection.
* **Type-Specific Formatting:** Dynamically renders distinct outputs for different item types at execution time.

---

##  Project Directory Structure

```text
├── Main.java           # Application entry point & presentation driver
├── LibraryItem.java    # Abstract superclass (Core Blueprint & Encapsulation)
├── Book.java           # Subclass extending LibraryItem (Overloading & Overriding)
└── Magazine.java       # Subclass extending LibraryItem (Overriding)
```

## Collaborators
* 003/26
* 014/26
