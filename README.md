🛒 E-Commerce Backend API (Spring Boot)
A production-grade e-commerce backend built with Spring Boot. This RESTful API handles product listings, user authentication with JWT, shopping cart operations, order processing, and role-based access — all designed with best practices and scalability in mind.

🚀 Features
✅ User registration & JWT-based login

✅ Role-based access control (Admin, User)

✅ Product catalog with pagination & sorting

✅ Category & product management (Admin)

✅ Add/remove items from shopping cart

✅ Order creation & order history

✅ Address management for shipping

✅ Input validation & centralized exception handling

✅ Deployed to AWS (EC2)

🛠️ Tech Stack
Backend: Java, Spring Boot, Spring Security, Spring Data JPA

Auth: JWT (JSON Web Tokens)

Database: MySQL / PostgreSQL

Deployment: AWS EC2

Build Tool: Maven

Other Tools: Lombok, Postman, DBeaver, MySQL WorkBench

📦 Getting Started
Prerequisites
Java 17+

Maven

MySQL or PostgreSQL

Clone and Run Locally
bash
Copy
Edit
git clone https://github.com/your-username/ecommerce-backend-api.git
cd ecommerce-backend-api
Create a database in MySQL/PostgreSQL.

Update application.properties or application.yml with your DB credentials.

Build and run the app:

bash
Copy
Edit
mvn clean install
mvn spring-boot:run
