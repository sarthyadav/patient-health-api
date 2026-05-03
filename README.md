# 🏥 Patient Health Record REST API

A RESTful API built with **Spring Boot**, **Java**, **MySQL**, and **JPA/Hibernate**
for managing patient health records. Supports full CRUD operations.

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java 21 | Programming Language |
| Spring Boot 3.5.14 | Backend Framework |
| Spring Data JPA | Database ORM |
| Hibernate | JPA Implementation |
| MySQL 8.0 | Relational Database |
| Maven | Dependency Management |
| Postman | API Testing |

---

## 📁 Project Structure

```
src/
└── main/
    └── java/
        └── com/healthrecords/patienthealthapi/
            ├── controller/
            │   └── PatientController.java
            ├── service/
            │   └── PatientService.java
            ├── repository/
            │   └── PatientRepository.java
            ├── model/
            │   └── Patient.java
            ├── exception/
            │   └── GlobalExceptionHandler.java
            └── PatientHealthApiApplication.java
```

## 🚀 Features

- ✅ Add a new patient record
- ✅ View all patient records
- ✅ View a single patient by ID
- ✅ Update an existing patient record
- ✅ Delete a patient record
- ✅ Global exception handling with clean error responses

---

## ⚙️ Setup & Installation

### Prerequisites
- Java 21+
- MySQL 8.0+
- Maven

### 1. Clone the repository
```bash
git clone https://github.com/YourUsername/patient-health-api.git
cd patient-health-api
```

### 2. Create the database
```sql
CREATE DATABASE healthdb;
```

### 3. Configure application.properties
cp src/main/resources/application.properties.example
src/main/resources/application.properties
Edit the file and add your MySQL credentials.

### 4. Run the project
```bash
mvn spring-boot:run
```
API will start at: `http://localhost:8080`

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | /patients | Add a new patient |
| GET | /patients | Get all patients |
| GET | /patients/{id} | Get patient by ID |
| PUT | /patients/{id} | Update patient |
| DELETE | /patients/{id} | Delete patient |

---

## 📋 Sample Request & Response

### Add Patient (POST /patients)
**Request Body:**
```json
{
    "name": "Sarthak Yadav",
    "age": 20,
    "bloodGroup": "B+",
    "diagnosis": "Fever",
    "doctorAssigned": "Dr. Sharma"
}
```

**Response (201 Created):**
```json
{
    "id": 1,
    "name": "Sarthak Yadav",
    "age": 20,
    "bloodGroup": "B+",
    "diagnosis": "Fever",
    "doctorAssigned": "Dr. Sharma"
}
```

### Error Response (404 Not Found):
```json
{
    "timestamp": "2026-05-03T17:45:00",
    "status": 404,
    "error": "Not Found",
    "message": "Patient not found with id: 99"
}
```

---

## 👨‍💻 Author

**Sarthak Yadav**  
Computer Science Undergraduate  
GitHub: [sarthyadav](https://github.com/sarthyadav)

---

## 📄 License
This project is open source and available under the [MIT License](LICENSE).
