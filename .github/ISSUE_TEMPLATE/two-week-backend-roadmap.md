---
name: Backend Two Week RoadMap
title: Backend-Two-Week-RoadMap-[YOUR_LASTNAME(S)]
labels: Backend Two Week RoadMap
about: This issue template is for backend mentees
---

##[Phase 1](https://star-academy.github.io/codestar-documents/docs/software-engineering/phase01-simple-project)

-   [ ] Introduction
-   [ ] Definition
    -   [ ] Data Extraction
    -   [ ] Data Transformation
    -   [ ] Data Loading
-   [ ] Learning
    -   [ ] Register
    -   [ ] Datasets
    -   [ ] Pipelines
    -   [ ] Add Source
    -   [ ] Add Destination
    -   [ ] Processors
    -   [ ] Filters
    -   [ ] Run Pipeline
    -   [ ] Cleansing
    -   [ ] Aggregation
    -   [ ] Join
    -   [ ] Export
    -   [ ] Share

##[Phase 2](https://star-academy.github.io/codestar-documents/docs/software-engineering/phase02-clean-code)

-   [ ] Clean Code Importance

    -   [ ] Think about the questions and discuss your answers with your teammate
        -   [ ] Write your answers to question 1:
            1. `[ANSWER 01]`
            1. `[ANSWER 02]`
            1. `[ANSWER 03]`
        -   [ ] Write your answers to question 2:
            1. `[ANSWER 01]`
            1. `[ANSWER 02]`
            1. `[ANSWER 03]`
    -   [ ] Visit the mentioned links in the doc and read the article individually
    -   [ ] Think about the questions and discuss your answers with your teammate
        -   [ ] Write your answers to question 1:
            1. `[ANSWER 01]`
            1. `[ANSWER 02]`
            1. `[ANSWER 03]`
        -   [ ] Write your answers to question 2:
            1. `[ANSWER 01]`
            1. `[ANSWER 02]`
            1. `[ANSWER 03]`

-   [ ] Read about these famous code smells individually

    -   [ ] Long Method
    -   [ ] Primitive Obsession
    -   [ ] Large Class
    -   [ ] Long Parameter List
    -   [ ] Temporary Field
    -   [ ] Duplicate Code

    Which code smells of above list exist in your search project?

    `[WRITE YOUR ANSWER HERE]`

-   [ ] Read about SOLID principles in software engineering:

    -   [ ] Single Responsibility
    -   [ ] Open-Close
    -   [ ] Liskov Substitution
    -   [ ] Interface Segregation
    -   [ ] Dependency Inversion

-   [ ] Refactoring Techniques:

    -   [ ] Take a look at Refactoring Techniques
    -   [ ] Fix code smells you mentioned for your search project in a new branch
    -   [ ] Make a PR (Pull Request) from new branch to master but do not merge it

        `[LINK TO YOUR PR]`

-   [ ] Code Review:
    -   [ ] Read Review Guides
       
##[Phase 3](https://star-academy.github.io/codestar-documents/docs/software-engineering/phase03-c-sharp)

-   [ ] Install **Requirements**:

    -   [ ] Install **.NET SDK**
    -   [ ] Install VS Code **C# Extension**

-   [ ] Read about **Solution** and **Project** in C# environment

-   [ ] Write your first Hello World C# app

-   [ ] Read about **NuGet** and learn how to use it

    -   [ ] Install **System.Text.Json** and serialize an object

-   [ ] Advanced Knowledge:

    -   [ ] Follow mentioned tutorial and learn about Reading data from **Console**
    -   [ ] Read about **Naming Guidelines** in C#
    -   [ ] Install **.Net Interactive**
        -   [ ] Execute first code
        -   [ ] Execute second code
    -   [ ] Read about **Lambda Expressions**
    -   [ ] Read about **Extension Method**
    -   [ ] Read about **LINQ**

-   [ ] Implement Student Grades & Average Project in C#

##[Phase 4](https://star-academy.github.io/codestar-documents/docs/software-engineering/phase04-unit-test)

-   [ ] Read about **Unit Test** and its importance

    -   [ ] Find out what's Unit Testing
    -   [ ] Write three reasons of using Unit Testing in Software development:
        1. `[REASON 1]`
        1. `[REASON 2]`
        1. `[REASON 3]`

-   [ ] Read about **Code Coverage** and its importance in Unit Testing

-   [ ] Unit Testing in **C#**:

    -   [ ] Find out how to write unit tests in C# with **xUnit**
    -   [ ] Find out how to run unit tests and check code coverage

-   [ ] Read about the effect of SOLID principles on Unit Testing

    -   [ ] Write your findings briefly:
        -   `[ANSWER]`

-   [ ] **Mocking** technique:

    -   [ ] Find out what's Mocking
    -   [ ] Find out why we should use mocking in unit tests
    -   [ ] Find out how to use mocking in C#

-   [ ] Writing unit tests for simple calculator
    -   [ ] Clone Project from [here](https://github.com/Star-Academy/SimpleCalculator)
    -   [ ] Copy project to your own Repository
    -   [ ] Start writing tests
    -   [ ] Increase code coverage (line or statement coverage) to at least 95%:
            `[CODE COVERAGE PERCENTAGE]`

##[Phase 5](https://star-academy.github.io/codestar-documents/docs/software-engineering/phase05-tdd)

-   [ ] Read about **TDD** concepts

    -   [ ] Write the steps of TDD cycle:
        1. `[STEPS]`

-   [ ] Effects of applying **SOLID** principles in **TDD**

    -   [ ] Think about that in your team, then write you answer:
        1. `[ANSWER]`
    -   [ ] Read about above title then update your answer:
        1. `[ANSWER]`

-   [ ] Reimplement Search Project in `C#` with **TDD** approach
    -   [ ] Write tests
    -   [ ] Implement the Search project so that all tests are passed
    -   [ ] Run tests and debug if some tests fail
    -   [ ] Refactor your code

##[Phase 6](https://star-academy.github.io/codestar-documents/docs/software-engineering/phase07-SQL)

- [ ] Read the introduction to SQL
- [ ] Understand basic concepts
- [ ] Install required softwares
    - [ ] Download PostgreSQL
    - [ ] Download Azure Data Studio
    - [ ] Install PostgreSQL with default configs
    - [ ] Install ADS
    - [ ] Run and configure ADS to work with Postgres
    - [ ] Create connection to the Postgres instance
- [ ] Create your own database
- [ ] Get familiar with different data types in Postgres
    - [ ] Write a suitable data type for each of the fields below:
        - `[FILL HERE]` for flight time
        - `[FILL HERE]` for email address
        - `[FILL HERE]` for a boolean variable
        - `[FILL HERE]` for stature
- [ ] Store some data
    - [ ] Create a table with arbitrary columns with data types you learned in the previous section
    - [ ] Insert some sample data into your table
    - [ ] Retrieve your data with different `SELECT` statements and different conditions
    - [ ] Try to change at least one of your table columns attributes using `ALTER` statement
- [ ] Perceive the importance and usage of each key
    - [ ] Add primary key constraint to your table
    - [ ] Try inserting different values for primary key and check whether it produces error or not
        - Try inserting duplicate primary key. Error [ ]
        - Try inserting `NULL` primary key. Error [ ]
    - [ ] Create a new table which is related to your existing table with a foreign key
    - [ ] Try inserting different values for foreign key to produce different errors
        - Try inserting none existing foreign key. Error [ ]
        - Try inserting duplicate foreign key. Error [ ]
        - Try inserting `NULL` foreign key. Error [ ]
- [ ] Perceive different types of joins
    - [ ] Write the corresponding set operation for each join like the given example
        - A Inner Join B : A ∩ B
        - A Left Outer Join B : `[FILL HERE]`
        - A Right Outer Join B : `[FILL HERE]`
        - A Full Outer Join B : `[FILL HERE]`
    - [ ] Test different joins on you tables
- [ ] Work with functions
    - [ ] Write a query for each present function in the document
     
##[Phase 7](https://star-academy.github.io/codestar-documents/docs/software-engineering/phase08-EFCore)

- [ ] Implement Top 3 Student project with EfCore in C#

##[Phase 8](https://star-academy.github.io/codestar-documents/docs/software-engineering/phase09-web)

## Web history

- [ ] Before starting: Read the link about history and purpose of creating & developing Web, then answer this questions:
  - [ ] How did developers provide server-client softwares for users before creation of web technologies?
  
      `[FILL HERE WITH YOUR ANSWER. (feel free to write in persian)]`

  - [ ] What was the main trouble with traditional technologies before web?
  
      `[FILL HERE WITH YOUR ANSWER. (feel free to write in persian)]`

  - [ ] How did web overcome this main trouble?
  
      `[FILL HERE WITH YOUR ANSWER. (feel free to write in persian)]`

## ASP.NET Core

- [ ] Getting Started with HTTP:
  - [ ] What does a protocol mean?
  
    `[FILL HERE WITH YOUR ANSWER. (feel free to write in persian)]`

  - [ ] Why designing a protocol for communication is important prerequirement of all other web related technologies?
  
    `[FILL HERE WITH YOUR ANSWER. (feel free to write in persian)]`

  - [ ] Try to get familier with HTTP by reading links.
  - [ ] Why HTTP is most popular protocol in web technologies?

    `[FILL HERE WITH YOUR ANSWER. (feel free to write in persian)]`

  - [ ] What is the most interesting aspect of HTTP in your opinion?
  
    `[FILL HERE WITH YOUR ANSWER. (feel free to write in persian)]`

- [ ] Getting Started with REST:
  - [ ] Read mentioned links.
  - [ ] Why do we need RESTful APIs?
  
    `[FILL HERE WITH YOUR ANSWER. (feel free to write in persian)]`

- [ ] Getting Started with Asp.net Core:
  - [ ] Read mentioned links.
  - [ ] Create a hello world API.
  - [ ] Call your api from browser.
  - [ ] Play with routing options! (Try to use it & enjoy it!)
  - [ ] Why do we need configurable routings in web development?
  
    `[FILL HERE WITH YOUR ANSWER. (feel free to write in persian)]`
  
  - [ ] Play with dependency injection! (Define an interface & inject interface implementation to code)
  - [ ] Why do we need dependency injection?
  
    `[FILL HERE WITH YOUR ANSWER. (feel free to write in persian)]`
  - [ ] Play with parameter binding! (use different modes)
  - [ ] Install postman.
  - [ ] Call your APIs with postman.
  
- [ ] Implement Asp.net Core Project:
  - [ ] Design your search API.
  - [ ] Implement & Test your API.

