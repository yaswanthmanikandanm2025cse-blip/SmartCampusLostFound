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

- **Day 1 (Today)**: Basic Project Setup & Console Main Menu Loop
- **Day 2**: Designing the Item Model (`Item.java`, attributes, getters/setters)
- **Day 3**: Implementing Lost Item Reporting (`Report Lost Item`)
- **Day 4**: Implementing Found Item Reporting (`Report Found Item`)
- **Day 5**: Viewing All Lost and Found Items (`View Items`)
- **Day 6**: Searching Items by Keyword/Category (`Search Item`)
- **Day 7**: Item Claiming Workflow (`Claim Item`)
- **Day 8**: Admin Management & Item Status Tracking
- **Day 9**: Simple File Persistence (Saving/Loading to text files)
- **Day 10**: Final Polish, Code Comments, Testing, and Documentation

---

## 📂 Project Structure (Day 1)

```text
SmartCampusLostAndFound/
├── src/
│   └── Main.java          # Entry point containing the console menu & loop
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
3. Compile the Java file:
   ```bash
   javac src/Main.java
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
   javac Main.java
   ```
3. Run:
   ```bash
   java Main
   ```

---

## 📋 Day 1 Status
- [x] Project folder structure created
- [x] `Main.java` created with `Scanner` and interactive loop
- [x] 8 menu options displayed
- [x] Placeholder messages ("Feature coming soon!") for options 1–7
- [x] Graceful exit on option 8
- [x] Input validation for unknown options
