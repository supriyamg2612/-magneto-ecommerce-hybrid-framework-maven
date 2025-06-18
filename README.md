# -magneto-ecommerce-hybrid-framework-maven
Automated end-to-end test framework for the Magento e-commerce demo site using Selenium WebDriver, TestNG, Maven, and ExtentReports. Built with a hybrid framework approach (POM + Data-Driven + Utility-Based).


This repository contains an automated test framework for [Magento Demo Site](https://magento.softwaretestingboard.com/) built using: **Java**

- **Selenium WebDriver**
    
- **TestNG**
    
- **Maven**
    
- **Page Object Model (POM)**
    
- **Hybrid Framework Design**
    
- **ExtentReports for Reporting**
    
- **Screenshot Utility**
    
- **Listener Integration**
    
- **Externalized Configuration via `.properties` file**
    
- ## 🔧 Tech Stack
    
    [](https://github.com/supriyamg2612/magneto-ecommerce-hybrid-framework-maven#-tech-stack)
    
- | Tool | Purpose | |----------------|-----------------------------------| | Java | Language | | Selenium | automation | | TestNG | Test execution & reporting | | Maven | Build & dependency management | | ExtentReports | Rich HTML test reports | | Listeners | Screenshot on failure, logging | | PageFactory | Page Object Model (POM) | | Properties File| Configurable URLs and credentials |
    

## Prerequisites

[](https://github.com/supriyamg2612/magneto-ecommerce-hybrid-framework-maven#prerequisites)

- Java JDK 8+
    
- Maven 3+
    
- ChromeDriver (compatible with your Chrome browser version)
    
- IDE (Eclipse, IntelliJ, etc.)
    
- Notes
    
- Page linking is implemented using the POM pattern, allowing testers to work independently on their modules.
    
- Assertions are made in test classes, not in page classes.
