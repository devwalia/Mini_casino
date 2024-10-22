# Mini_casino

# Casino API Project

## Disclaimer
**Dev Walia**  
I would like to start by clarifying that I was not provided with the original Spring Boot project file for this assignment, despite requesting it approximately 3 to 4 times. After multiple attempts to obtain the required files without success, I decided to take the initiative and proceed with the project on my own. As a result, I created a new Spring Boot project from scratch, applying my own logic, setup, and knowledge to address the challenges presented in the project.

To complete the task, I created a Spring Boot project by configuring the necessary dependencies, such as Spring Web and Spring Boot DevTools, and using Maven as the build tool. I structured the project with different layers, including the Controller, Service, and Model layers, ensuring a clean separation of concerns. The Controller handles the HTTP requests (like registering players, checking balances, and making deposits), the Service layer manages the business logic (like player registration and deposit handling), and the Model represents the data structure for players and bets. I also set up endpoints for tasks like listing games, registering players, placing bets, and retrieving player balances, along with basic error handling.

The answers and solutions I have provided are based on the information contained in the PDF provided, and I applied the best possible approach to solve each problem without the official Spring Boot project. While I am aware that my approach may differ from the intended one due to the absence of the original files, I have done my best to ensure that each question is answered thoughtfully and logically.

Should you still be able to provide the original Spring Boot project, I am more than willing to revisit the task and apply my knowledge to enhance the solution. The work I am submitting here reflects my ability to adapt and solve problems using the resources available to me.

---

## Project Overview
This project is a Casino API that provides functionality for players to:
- Register
- Place a bet
- Deposit money
- Get their balance
- List available games and their details

### Technologies Used:
- **Language**: Java  
- **Framework**: Spring Boot  
- **Build Tool**: Maven  
- **Testing Tool**: Postman for API Testing  
- **IDE**: IntelliJ IDEA

---

## Endpoints

1. **List Games**
    - **GET** `/casino/games`
    - Returns the list of available games with details.

2. **Register a Player**
    - **POST** `/casino/register`
    - Request Body Example:
      ```json
      {
        "name": "John Doe",
        "username": "john_doe",
        "birthdate": "1990-01-01",
        "balance": 100.0,
        "bonusBalance": 0.0
      }
      ```

3. **Deposit Money**
    - **POST** `/casino/deposit`
    - Example Request:
      ```
      POST /casino/deposit?username=john_doe&amount=50
      ```

4. **Get Player Balance**
    - **GET** `/casino/balance`
    - Example Request:
      ```
      GET /casino/balance?username=john_doe
      ```

5. **Place a Bet**
    - **POST** `/casino/bet`
    - Allows a player to place a bet on a game.
    - Example Request Body:
      ```json
      {
        "username": "john_doe",
        "gameId": 1,
        "betAmount": 20.0
      }
      ```

---

## Project Setup and How to Run

### Prerequisites:
- Java 11 or later
- Maven
- IDE (IntelliJ, Eclipse, etc.)

### Running the Project:
1. **Clone the Repository**:
    ```bash
    git clone https://github.com/devwalia/casino-api.git
    cd casino-api
    ```

2. **Build the Project with Maven**:
    ```bash
    mvn clean install
    ```

3. **Run the Application**:
    ```bash
    mvn spring-boot:run
    ```

4. The API will be running on `http://localhost:8080`.

5. **Test the Endpoints**:
   - You can use Postman or another API testing tool to test the available endpoints listed above.

### Example Postman Requests:
- **Register Player**:
    ```json
    POST http://localhost:8080/casino/register
    Body:
    {
      "name": "John Doe",
      "username": "john_doe",
      "birthdate": "1990-01-01",
      "balance": 100.0,
      "bonusBalance": 0.0
    }
    ```

- **Deposit Money**:
    ```bash
    POST http://localhost:8080/casino/deposit?username=john_doe&amount=50
    ```

- **Get Balance**:
    ```bash
    GET http://localhost:8080/casino/balance?username=john_doe
    ```

### Testing:
Use Postman to test the APIs. Import the Postman collection or manually enter the API calls. You should see responses such as successful registration, deposit updates, and correct balance retrieval.

---

## Final Thoughts:
This project showcases a basic casino API that meets the assignment's core requirements. I would have been able to refine and expand on this project had I received the original Spring Boot files, but I have taken the initiative to build everything from scratch to demonstrate my problem-solving skills and ability to work independently.

Please reach out if any additional clarification is needed.
