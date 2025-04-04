 Weekly Tasks - The Chance Internship

## 
Week 1
🧩 Kotlin Sudoku Validator

A flexible and clean Kotlin implementation to validate Sudoku boards of various sizes (e.g., 4×4, 9×9, 16×16). Designed with modular structure and testability in mind, ideal for learning and real-world problem solving.

📌 Overview
This project validates whether a given Sudoku grid is valid by checking that:

Each row contains unique digits.

Each column contains unique digits.

Each subgrid (based on the board size) contains unique digits.

Empty cells are allowed and represented by '-'.

Digits must be between 1 and 9 (or up to F for larger boards), with no leading zeros or non-digit characters.

✅ Features
🔁 Supports multiple board sizes: 4×4, 9×9, 16×16, etc.

📦 Modular structure: Clear separation between row, column, and subgrid validation.

🧪 Unit-tested: Covers a variety of valid and invalid input scenarios.

⚠️ Validation logic: Checks syntax, value range, and uniqueness across all sections.

 
📁 Project Structure
bash
Copy
Edit
├── Sudoku.kt       # Core validation logic
├── Test.kt         # Contains test cases
└── README.md       # Project documentation
👨‍💻 About the Developer
This project was built during my internship at The Chance, focusing on writing clean Kotlin code, improving problem-solving skills, and applying test-driven development (TDD) principles.

--------------------------------------------------------------
--------------------------------------------------------------
--------------------------------------------------------------
--------------------------------------------------------------

IPv4 Validator in Kotlin

This project demonstrates a Kotlin implementation for validating IPv4 addresses. It checks whether a given string conforms to the rules of a valid IPv4 format using clean logic and robust conditions.

🧠 What is an IPv4 Address?
An IPv4 address is a 32-bit numerical label, typically written as four decimal numbers (octets) separated by dots, e.g., 192.168.0.1.

Each octet must:

Be a number from 0 to 255.

Contain no leading zeros, unless it is exactly 0.

Include exactly four segments separated by dots.

✅ Validation Logic
The validator checks the following:

The input string contains exactly four segments.

Each segment is numeric and within the valid range (0–255).

Segments cannot contain non-digit characters or leading zeros.

Edge cases such as empty strings or invalid formats are rejected.

📁 Project Structure
cpp
Copy
Edit
/ipv4-validator
├── src/
│   └── main.kt       // IPv4 validation logic
├── README.md         // Project overview and usage
🛠 Built With
Kotlin

IntelliJ IDEA or any Kotlin-supported IDE


## 🚀 About Me
I'm a android developer...

www.linkedin.com/in/mohammedjabour22

