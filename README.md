# OpenCart Automation Testing

Automated end‑to‑end testing framework for the **OpenCart e‑commerce platform** using **Selenium WebDriver**, **Java**, and **TestNG**.
The project follows **Page Object Model (POM)** best practices to ensure clean, maintainable, and scalable test automation.

---

## 📌 Project Overview

This project automates core OpenCart user flows such as:

* User registration
* Login & authentication
* Product browsing
* Add to cart
* Checkout process

It is designed to simulate real user behavior and validate critical e‑commerce functionality.

---

## 🛠 Tech Stack

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)
* **Browser Support:** Chrome (can be extended)

---

## 📂 Project Structure

```
Open-Cart-Automation-Testing
│
├── src/test/java
│   ├── pages          # Page Object classes
│   ├── testcases      # TestNG test classes
│   ├── utils          # Utilities (drivers, helpers, waits)
│
├── src/test/resources
│   ├── testng.xml     # Test suite configuration
│
├── pom.xml            # Maven dependencies
└── README.md
```

---

## ✅ Automated Test Scenarios

* User registration
* Login
* Add product to cart
* Verify cart contents
* Checkout
* Form validation during checkout

---

## ▶️ How to Run the Tests

### 1️⃣ Prerequisites

* Java JDK 8+
* Maven installed
* Chrome browser
* ChromeDriver compatible with your Chrome version

### 2️⃣ Clone the repository

```bash
git clone https://github.com/MaZeNHeKaL29/Open-Cart-Automation-Testing.git
```

### 3️⃣ Run tests using Maven

```bash
mvn test
```

Or run directly via **testng.xml** from your IDE.

---

## 🧪 Test Design Highlights

* Reusable page actions using POM
* Explicit waits for element synchronization
* Clear separation between test logic and UI locators
* Easily extendable for more scenarios

---


## 👤 Author

**Mazen Hekal**
🔗 GitHub: [https://github.com/MaZeNHeKaL29](https://github.com/MaZeNHeKaL29)

---

## 📄 License

This project is for **learning and demonstration purposes**.
