# 🎓 Smart Campus Lost & Found Management System

A beginner-friendly console application built using **pure Core Java**. This system is designed to help university and college campuses report, track, search, and claim lost and found belongings in a structured and transparent way.

---

## 📌 Project Overview
- **Language**: Core Java (Standard Edition)
- **Architecture**: Object-Oriented Programming (OOP) Console Application
- **Dependencies**: None (Zero external libraries, No Maven, No Spring Boot, No Database)
- **Data Storage**: In-memory (ArrayList) and basic file storage (introduced in later days)

---

## 📅 10-Day Learning Roadmap

- **Day 1**: Basic Project Setup & Console Main Menu Loop ✅
- **Day 2 (Today)**: Classes, Objects, Constructors & User Profile (`User.java`) ✅
- **Day 3**: Designing the Item Model & Reporting Lost Items
- **Day 4**: Reporting Found Items
- **Day 5**: Viewing All Lost and Found Items
- **Day 6**: Searching Items by Keyword/Category
- **Day 7**: Item Claiming Workflow
- **Day 8**: Admin Management & Item Status Tracking
- **Day 9**: Simple File Persistence (Saving/Loading to text files)
- **Day 10**: Final Polish, Code Comments, Testing, and Documentation

---

## 📂 Project Structure (Day 2)

```text
SmartCampusLostAndFound/
├── src/
│   ├── Main.java          # Entry point containing registration & menu loop
│   └── User.java          # User class representing campus students/staff
├── .gitignore             # Ignores compiled .class files and IDE files
└── README.md              # Project documentation and guide
```

---

## 🚀 How to Compile and Run

Make sure you have Java installed (`java -version` and `javac -version`).

### Option 1: Running from the Project Root Directory

1. Open PowerShell or Command Prompt.
2. Navigate to the project folder:
   ```bash
   cd C:\Users\HP\.gemini\antigravity-ide\scratch\SmartCampusLostAndFound
   ```
3. Compile all Java files:
   ```bash
   javac src/*.java
   ```
4. Run the program:
   ```bash
   java -cp src Main
   ```

### Option 2: Running directly from the `src` folder

1. Navigate to the `src` folder:
   ```bash
   cd C:\Users\HP\.gemini\antigravity-ide\scratch\SmartCampusLostAndFound\src
   ```
2. Compile:
   ```bash
   javac *.java
   ```
3. Run:
   ```bash
   java Main
   ```

---

## 📋 Progress Checklist
- [x] **Day 1**: Project folder structure created, `Main.java` with 8-option loop, graceful exit.
- [x] **Day 2**: `User.java` class created with attributes (`name`, `studentId`, `department`), constructor, `displayUserDetails()` method, and keyboard input via `Scanner`.
