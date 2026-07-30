# AssetsManagementSystem-Hibernate
This repo cantain Asset Management System - Hibernate project 
Asset Management System (Hibernate)

About the Project

The Asset Management System is a Java-based console application developed using Hibernate ORM, MySQL, and Maven as part of my MCA learning journey. The project is designed to manage organizational assets efficiently by performing database operations through Hibernate instead of writing manual SQL queries.

This project demonstrates the implementation of Object Relational Mapping (ORM), entity mapping, session management, and CRUD operations using Hibernate with a clean Maven project structure.

---

Project Objectives

- Learn Hibernate ORM and Object Relational Mapping (ORM).
- Understand entity mapping using annotations.
- Perform CRUD operations using Hibernate.
- Integrate Java applications with MySQL.
- Gain practical experience with Maven-based projects.


Features

Asset Management

- Add New Asset
- View All Assets
- Update Asset Information
- Delete Asset
- Store Asset Details in MySQL Database

Hibernate Features

- Annotation-Based Entity Mapping
- SessionFactory Configuration
- Session Management
- Transaction Management
- Hibernate Configuration File

---

Technologies Used

Technology| Purpose
Java| Programming Language
Hibernate ORM| Object Relational Mapping
MySQL| Relational Database
Maven| Build & Dependency Management
Eclipse IDE| Development Environment

---

Project Architecture

User
   │
   ▼
Java Console Application
   │
   ▼
Hibernate ORM
   │
   ▼
MySQL Database

The application uses Hibernate ORM to map Java entity classes to database tables, allowing database operations to be performed using Java objects instead of writing SQL queries directly.

---

Project Structure

AssetManagementSystem
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.shubham.AssetManagementSystem
│   │   │       ├── App.java
│   │   │       ├── AddNewAsset.java
│   │   │       ├── ViewAllAsset.java
│   │   │       ├── UpdateAsset.java
│   │   │       ├── DeleteAsset.java
│   │   │       ├── HibernateCom.java
│   │   │       └── Util
│   │   │           └── AssetEntity.java
│   │   │
│   │   └── resources
│   │       └── hibernate.cfg.xml
│   │
│   └── test
│
├── pom.xml
└── README.md


Application Workflow

1. Configure the database connection in "hibernate.cfg.xml".
2. Start the application.
3. Hibernate creates a "SessionFactory".
4. Open a Hibernate session.
5. Perform one of the following operations:
   - Add New Asset
   - View All Assets
   - Update Asset Details
   - Delete Asset
6. Commit the transaction.
7. Hibernate updates the MySQL database automatically.

Hibernate Concepts Covered

- Hibernate Configuration
- Entity Mapping
- SessionFactory
- Session Management
- Transactions
- Annotation-Based Mapping
- CRUD Operations
- Maven Project Structure

Getting Started

Prerequisites

- Java JDK 8 or later
- MySQL Server
- Maven
- Eclipse IDE or IntelliJ IDEA

Installation

Clone this repository:

git clone https://github.com/shubhamgangurde58/AssetsManagementSystem-Hibernate.git

Import the project as a Maven Project.

Configure your database credentials inside "hibernate.cfg.xml".

Build the project:

mvn clean install

Run the application using:

App.java

Learning Outcomes

Through this project, I gained practical experience in:

- Hibernate ORM
- Object Relational Mapping (ORM)
- Entity Class Design
- Session and Transaction Management
- CRUD Operations
- Maven Project Configuration
- MySQL Database Integration
- Java Backend Development

Future Improvements

I plan to enhance this project by adding:

- User Authentication
- Asset Search Functionality
- Asset Category Management
- Asset Allocation Tracking
- Asset Return Management
- Input Validation
- Exception Handling
- Logging Framework
- Spring Boot Integration
- REST API Development
- Web Interface using JSP & Servlets

Author

Shubham Santosh Gangurde

BCA Student
Aspiring Java Full Stack Developer

GitHub: https://github.com/shubhamgangurde58

---

Note

This project was developed as part of my MCA learning journey to understand Hibernate ORM and Java database application development. It demonstrates how Hibernate simplifies database operations through Object Relational Mapping while implementing CRUD functionality in a Maven-based Java project. The project strengthened my understanding of persistence, entity mapping, transaction management, and backend development concepts.

If you find this repository useful, consider giving it a Star on GitHub.
