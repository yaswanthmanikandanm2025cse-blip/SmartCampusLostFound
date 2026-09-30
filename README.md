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
- **Day 2**: Classes, Objects, Constructors & User Profile (`User.java`) ✅
- **Day 3**: LostItem class & Report Lost Item feature ✅
- **Day 4**: ArrayList to store multiple LostItems + View Lost Items ✅
- **Day 5**: FoundItem class, Report Found Item, View Found Items, Search Item ✅
- **Day 6**: Claim module — `Claim.java`, submit claims, `ArrayList<Claim>`, Pending status ✅
- **Day 7**: Admin login panel, view items, view claims, Approve/Reject claims ✅
- **Day 8**: Simple File Persistence (Saving/Loading to text files)
- **Day 9**: Final Polish, Code Comments, Testing, and Documentation

---

## 📂 Project Structure (Day 7)

```text
SmartCampusLostAndFound/
├── src/
│   ├── Main.java          # Entry point: menu loop, all feature methods
│   ├── User.java          # User class (name, studentId, department)
│   ├── LostItem.java      # LostItem class (6 fields, displayItem)
│   ├── FoundItem.java     # FoundItem class (6 fields, displayItem)
│   ├── Claim.java         # Claim class (status defaults to Pending)
│   └── Admin.java         # Admin login, view/approve/reject claims
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

## 🔐 Admin Login Credentials

| Field    | Value      |
|----------|------------|
| Username | `admin`    |
| Password | `admin123` |

---

## 📋 Progress Checklist
- [x] **Day 1**: Project folder structure, `Main.java`, 8-option menu loop, graceful exit.
- [x] **Day 2**: `User.java` — class, constructor, `displayUserDetails()`, Scanner input.
- [x] **Day 3**: `LostItem.java` — 6 fields, constructor, `displayItem()`, Report Lost Item in menu.
- [x] **Day 4**: `ArrayList<LostItem>` — store multiple items, View Lost Items with for-each loop.
- [x] **Day 5**: `FoundItem.java` — Report Found Item, View Found Items, Search with `equalsIgnoreCase()`.
- [x] **Day 6**: `Claim.java` — 6 fields (status = Pending by default), `ArrayList<Claim>`, submit claim via menu option 6.
- [x] **Day 7**: `Admin.java` — admin login (`admin`/`admin123`), Admin Menu, view lost/found/claims, Approve Claim, Reject Claim, invalid ID handling.
