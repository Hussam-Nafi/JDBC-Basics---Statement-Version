# 🎓 Student Management System (JDBC)

A clean and structured Java console application for managing student records using JDBC and PostgreSQL, following a layered architecture (DAO, Service, UI).

---

## 🚀 Features

* View all students
* Add new student
* Update student details
* Delete student
* Search student by ID
* Interactive console menu system

---

## 🛠️ Tech Stack

* Java
* JDBC
* PostgreSQL
* Maven

---

## 🧠 Concepts & Design

* DAO Design Pattern
* Layered Architecture (DAO / Service / UI)
* PreparedStatement (for secure queries)
* ResultSet Mapping (Object Mapping)
* Try-with-resources (automatic resource management)
* Separation of Concerns

---

## ⚙️ Setup

1. Create a PostgreSQL database
2. Update database credentials in `DBConnection.java`
3. Run the `Main` class

---

## 📌 Project Structure

```
com.hussam
│
├── dao        # Database operations (StudentDAO)
├── service    # Business logic (StudentService)
├── ui         # Console interaction (StudentMenu)
├── model      # Data model (Student)
├── db         # Database connection (DBConnection)
└── Main       # Entry point
```

---

## 📌 Future Improvements

* Input validation (email, phone, etc.)
* Better exception handling (custom exceptions)
* Logging system instead of console prints
* Unit testing (JUnit)
* Migration to Hibernate / Spring Data JPA
* REST API (Spring Boot)

---

## 👨‍💻 Author

Hussam Nafi
