# Evallo QA Automation Assignment – Sauce Demo UI

This project contains UI automation tests for the Sauce Demo Store using Selenium WebDriver, TestNG, and Java (with Page Object Model).

---

## 📌 Tech Stack
- **Language**: Java 11+
- **Build Tool**: Maven
- **Framework**: TestNG
- **Automation**: Selenium WebDriver
- **Driver Management**: WebDriverManager

---

## Project Structure

src/
├── base/ # Common test setup (BaseTest.java)
├── pages/ # Page Object classes (LoginPage, InventoryPage, etc.)
├── tests/ # TestNG test cases (PurchaseFlowTest, NegativeLoginTest)
testng.xml # Test suite configuration
pom.xml # Maven config
README.md # Project guide
defect-report.md # Documented bug found during testing
Evallo_Test_Strategy.pdf # Test strategy document

---

### **Setup Instructions**

## 🔧 Setup Instructions

### Prerequisites
- Java 11 or above
- Maven installed (`mvn -v`)
- Chrome browser

### Clone & Install

git clone https://github.com/your-username/SA-QA-DeepuMaurya.git

cd SA-QA-DeepuMaurya

mvn clean install

---

### **How to Run Tests**
 markdown
##  Running Tests

### Using Maven:

mvn test

Using Eclipse:
Right-click testng.xml → Run As → TestNG Suite


---

###  **Report Location**

## 📄 Reports

- Test results are printed in the console
- To integrate an HTML report, you can add ExtentReports or Surefire Report Plugin
- Default report path (if implemented): `target/surefire-reports/index.html`

## Test Coverage

- **PurchaseFlowTest.java** – Happy path: login, add item, checkout, verify confirmation
- **NegativeLoginTest.java** – Locked-out user error message validation


## Defect Report

 Known Defects

Refer to [defect-report.md](./defect-report.md) for details on a reproducible issue found during testing.


## Test Strategy Document

Test strategy for this automation suite is available at:
[Evallo_Test_Strategy.pdf](./Evallo_Test_Strategy.pdf)

## Future Enhancements

- Add cross-browser support
- Enable headless mode for CI pipelines
- Add ExtentReports for rich HTML reporting
- Group tests by tags (Smoke, Regression, Negative)

## Compatibility

- OS: Windows, macOS, Linux
- Browser: Chrome (via WebDriverManager)
