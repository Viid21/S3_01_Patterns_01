# 🧑‍💻 Task S3.01. Design Pattern – Singleton (Undo Command)  
**Author:** David Rey  

## 📄 Description  
This project demonstrates the use of the **Singleton design pattern** in Java. The goal is to implement an `Undo` class that replicates the behavior of the *Undo* command, storing and managing the history of commands entered by the user.  

The `Undo` class must:  
- Be implemented as a **Singleton** (only one instance exists throughout the application).  
- Store the last commands introduced.  
- Allow adding new commands.  
- Allow removing commands.  
- List all commands stored (similar to the `history` command in Linux).  

The `Main` class will provide a console interface to interact with the `Undo` class, demonstrating the pattern in action.

---

## 🔹 Project Structure  

```
src/
 ├── Main.java
 └── Undo.java
```

- **Undo.java**  
  - Implements the Singleton pattern.  
  - Contains methods:  
    - `getInstance()` → returns the single instance.  
    - `addCommand(String command)` → adds a command to the history.  
    - `removeCommand()` → removes the last command.  
    - `listCommands()` → prints all stored commands.  

- **Main.java**  
  - Provides a console menu for the user:  
    - Add a command.  
    - Remove the last command.  
    - Show history of commands.  
    - Exit.  
  - Demonstrates the use of the Singleton `Undo` class.

---

## 💻 Technologies Used  
- Java SE 24  
- IntelliJ IDEA as the development environment  
- Git & GitHub for version control  
- Design Patterns: Singleton  
- OOP Principles: Encapsulation, static instance management  

---

## 📋 Requirements  
- Java Development Kit (JDK) 24 or higher  
- IntelliJ IDEA or any Java-compatible IDE  
- Git installed to clone the repository  
- Basic knowledge of Java and design patterns  

---

## 🛠️ Installation  
- Clone the repository:  
```bash
git clone https://github.com/Viid21/S2_05_Singleton_Undo.git
