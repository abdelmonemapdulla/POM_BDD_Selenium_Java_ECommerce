
# Test Automation E-Commerce Website

> Implementing a test automation framework using Selenium WebDriver for GUI front-end testing. Created with lessons learned from a large number of development projects to provide all commonly required components and concepts.
Testing has been done for this demo https://demo.nopcommerce.com


## Concepts Included

* Applying the Page Object Model design pattern (POM).
* Behavior driven development (BDD).
* OOP.
* Parallel execution.

## Tools

* Maven
* Selenium WebDriver
* Cucumber using Gherkin
* Allure Cucumber
* JUnit
* SureFire Plugin

## Requirements

In order to utilise this project you need to have the following installed locally:

* Chrome
* Java 1.8


## Usage


To run all features from command prompt, navigate to `POM_BDD_Selenium_Java_ECommerce` directory and run CMD:

`mvn verify`

## Reporting

* Tests result is generated after each test run in an allure cucumber report for each feature.
* In the case of test failures, a screenshot of the UI at the point of failure is embedded into the report.
