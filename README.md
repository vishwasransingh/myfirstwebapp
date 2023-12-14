# To Do List Manager

## Description

To Do List Manager is a Spring Boot based web application for the management of tasks to do. The app maintains a separate list of tasks for each user. The details regarding task include the target date for it's achievement and task description.

## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
  - [Sign-In](#sign-in)
  - [To-Do List Operations](#to-do-list-operations)
- [Features](#features)
- [Acknowledgments](#acknowledgments)

## Getting Started

### Prerequisites
Ensure you have the following prerequisites installed:
- JDK 1.8+
- MySQL Database
- Maven
- Compatible web browser

### Installation
1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/todo-list-manager.git
2. Navigate to the project directory:
   ```bash
   cd your-path\todo-list-manager
3. Configure the application.properties file with your MySQL database settings:
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_database_username
   spring.datasource.password=your_database_password
4. Build and run your application:
   ```bash
   mvn spring-boot:run

### Usage
### 1. Sign-In
Upon launching the application, you will be automatically directed to the sign-in page. Enter your credentials to access your personalized to-do list.

To-Do List Operations
Adding a Task: Click on the "Add Task" button, enter the task details, and submit.

Removing a Task: Use the "Remove" button next to each task to delete it from your list.

Updating a Task: Click on the task you want to update, modify the details, and save the changes.

### Features
Terminating the App
Click on the "Close App" button to gracefully shut down the application.

### Acknowledgments
Spring Boot - The framework used for building the application.
Spring Security - Provides authentication and authorization features.


