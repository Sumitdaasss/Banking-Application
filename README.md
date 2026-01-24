🏦 Banking Application – Spring Boot REST API with DevOps

A simple Banking Application built using Spring Boot REST APIs, demonstrating core banking operations like account creation, deposit, withdrawal, and balance inquiry.
The project is fully containerized with Docker and includes a CI/CD pipeline using GitHub Actions.

🚀 Features

Created a Bank Account

Deposit Money

Withdraw Money

Check Account Balance

RESTful APIs with JSON responses

Dockerized Spring Boot application

Automated CI/CD pipeline using GitHub Actions


🛠 Tech Stack
Layer	Technology
Backend	Spring Boot, Java
API	REST API
Build Tool	Maven
Containerization	Docker
CI/CD	GitHub Actions
Version Control	Git & GitHub
📂 Project Structure
Banking-Application
│
├── src/main/java
│   └── com.example.banking
│       ├── controller
│       ├── service
│       ├── repository
│       └── model
│
├── src/main/resources
│   └── application.properties
│
├── Dockerfile
├── pom.xml
└── .github/workflows/ci.yml


🔗 API Endpoints
➤ Create Account
POST /api/accounts/create

➤ Deposit Money
POST /api/accounts/deposit

➤ Withdraw Money
POST /api/accounts/withdraw

➤ Check Balance
GET /api/accounts/{accountId}/balance


🐳 Docker Integration
Build Docker Image
docker build -t banking-app .

Run Docker Container
docker run -p 8080:8080 banking-app


Access Application
http://localhost:8080


🔄 GitHub Actions – CI/CD Pipeline
Pipeline Includes:

Code checkout

Maven build

Run tests

Build Docker image

GitHub Actions Workflow
name: Spring Boot CI
run: docker build -t banking-app .


📦 How to Run Locally
Step 1: Clone Repository
git clone https://github.com/Sumitdaasss/Banking-Application.git

Step 2: Run Spring Boot App
mvn spring-boot:run

Step 3: Run with Docker
docker build -t banking-app .
docker run -p 8080:8080 banking-app

👨‍💻 Author

Sumit Das

GitHub: Sumitdaasss

Email: sumitdas95504@gmail.com
