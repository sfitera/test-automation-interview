# Test Automation Framework  

This repository contains a simple test automation framework written in **Java** using **Selenium** and **TestNG**. The framework follows the **Page Object Model (POM)** design pattern for better maintainability.  

## Application Under Test  
The tests are written for **Swag Labs** ([www.saucedemo.com](https://www.saucedemo.com)).  

## Tasks  
Your assignment consists of the following tasks:  

### 🛠 Task 1: Fix a Failing Test  
**Scenario:**  
- **GIVEN** a locked-out user  
- **WHEN** the user tries to log in  
- **THEN** an error message is displayed  

There is a test case in the repository that is currently failing. Your task is to analyze the issue and fix it.  

### 📝 Task 2: Automate a New Test Scenario  
**Scenario:**  
- **GIVEN** a standard user  
- **WHEN** the user adds a **random** item to the cart  
- **THEN** the item should be successfully added to the cart  

Implement this test case using the existing framework and ensure it follows the **Page Object Model (POM)** principles.  

### 💻 Task 3: Run Tests from the Command Line  
Find out how to run the tests from the command line using **Maven** and **TestNG**. Provide the exact command you used to execute the tests.  

💡 **Hint:**  
- The project uses **Maven** for dependency management and execution.  
- TestNG test execution is typically triggered using:  

  ```sh
  mvn clean test

### ✅ Submission instructions:  
- **Task 1 & Task 2 → Commit to the forked repo.**  
- **Task 3 → Document the solution in `README.md`.**  


TASK 3: 
I used the command : mvn clean test
Beforehand i have moved all tests into the test directory (src/test/java/sk/phenomenix/pages) where they should be.
Then the tests can be run with the mentioned command automatically. 
I was also searching the internet for alternative solution, found that tests can be run using testng.xml,
but this i found the most logical. 