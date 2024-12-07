Bank Database System**

This project is a simple **Bank Database System** designed to manage and store customer information, bank accounts, and transactions. The system also provides an **API** that interacts with the database to perform operations such as adding accounts, viewing account details, making deposits and withdrawals, and transferring funds between accounts.

---

Features

- **Account Management**: Add new bank accounts, view account details, and update customer information.
- **Transactions**: Make deposits and withdrawals to/from accounts.
- **Transfers**: Transfer funds between different customer accounts.
- **Simple API**: A RESTful API that allows interaction with the database via HTTP requests.
  
---

Technologies Used

- **Java**: The core language for developing the backend and handling business logic.
- **SQL Database**: A relational database used for storing customer and account information.
- **Spring Boot**: A lightweight framework to build the REST API (if applicable).
- **JDBC**: Java Database Connectivity used for connecting to and querying the SQL database.

---

Installation

To run the Bank Database System locally, follow these steps:

1. **Clone the repository**:

   ```bash
   git clone https://github.com/your-username/Bank-Database-System.git
   ```

2. **Set up the database**:
   - Install and configure a relational database (e.g., MySQL, PostgreSQL).
   - Import the `schema.sql` file provided in the project to create the required tables.

3. **Run the application**:
   - In the project directory, compile and run the application using your IDE or command line:
   
     ```bash
     javac Main.java
     java Main
     ```

4. **Access the API**:
   - The API is accessible at `http://localhost:8080` (default). You can make GET, POST, PUT, DELETE requests to the endpoints defined below.

---

API Endpoints

Here are the available API endpoints to interact with the Bank Database:

### **1. Create a New Account**
- **URL**: `/accounts`
- **Method**: `POST`
- **Request Body**: 
  ```json
  {
    "accountHolder": "John Doe",
    "accountType": "Checking",
    "balance": 1000.00
  }
  ```
- **Response**: 
  ```json
  {
    "status": "success",
    "message": "Account created successfully",
    "accountId": 12345
  }
  ```

### **2. View Account Details**
- **URL**: `/accounts/{accountId}`
- **Method**: `GET`
- **Response**:
  ```json
  {
    "accountId": 12345,
    "accountHolder": "John Doe",
    "accountType": "Checking",
    "balance": 1000.00
  }
  ```

### **3. Deposit Money**
- **URL**: `/accounts/{accountId}/deposit`
- **Method**: `POST`
- **Request Body**: 
  ```json
  {
    "amount": 200.00
  }
  ```
- **Response**:
  ```json
  {
    "status": "success",
    "message": "Deposit successful",
    "newBalance": 1200.00
  }
  ```

### **4. Withdraw Money**
- **URL**: `/accounts/{accountId}/withdraw`
- **Method**: `POST`
- **Request Body**:
  ```json
  {
    "amount": 100.00
  }
  ```
- **Response**:
  ```json
  {
    "status": "success",
    "message": "Withdrawal successful",
    "newBalance": 1100.00
  }
  ```

### **5. Transfer Funds**
- **URL**: `/accounts/transfer`
- **Method**: `POST`
- **Request Body**:
  ```json
  {
    "fromAccountId": 12345,
    "toAccountId": 67890,
    "amount": 300.00
  }
  ```
- **Response**:
  ```json
  {
    "status": "success",
    "message": "Transfer successful",
    "fromAccountNewBalance": 800.00,
    "toAccountNewBalance": 500.00
  }
  ```

---

Running Tests

If you want to run tests on the API or database functionality:

1. Navigate to the `tests/` folder.
2. Use your preferred testing framework (e.g., JUnit, Postman, or integration tests) to validate API responses and database integrity.


### **Link to Project:**
[**Bank Database System on Replit**](https://replit.com/@TWill/Project1#jdt.ls-java-project/.classpath)
