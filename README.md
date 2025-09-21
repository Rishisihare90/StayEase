# StayEase – Full-Stack Hotel Booking Platform

## About the Project

**StayEase** is a full-stack hotel booking platform designed to provide a seamless experience for both customers and administrators. The application features a secure, stateless RESTful API built with Spring Boot, which powers a responsive user interface created with React.

The core of the system is a real-time room availability search engine, allowing users to find and book rooms based on their travel dates. The platform enforces a robust security model with role-based access control and handles payments securely via the Stripe API.

---

## ✨ Key Features

- **Secure Authentication:** End-to-end user authentication and authorization using Spring Security and JSON Web Tokens (JWT).
- **Role-Based Access Control (RBAC):** Distinct functionalities for **Admin** (room and booking management) and **Customer** (booking and viewing own history) roles.
- **Real-Time Room Availability Search:** A complex search engine to find and filter available rooms by check-in/check-out dates and room type.
- **Secure Payment Processing:** Integration with the **Stripe API** to handle booking payments securely.
- **Ownership-Based Security:** Fine-grained authorization rules ensuring users can only access their own booking information.
- **Room Catalog Management:** Full CRUD operations for administrators to manage hotel rooms, including details, pricing, and image uploads.
- **Booking Management:** A complete lifecycle for booking reservations, from creation to retrieval via a unique reference number.

---

## 🛠️ Tech Stack

#### **Backend:**

- **Java 17** - Core programming language.
- **Spring Boot** – For building the RESTful API.
- **Spring Security** – For authentication and authorization.
- **Spring Data JPA / Hibernate** – For database interaction.
- **JWT (JSON Web Tokens)** – For stateless, token-based security.
- **Stripe API** – For secure payment processing.
- **Maven** – For project management and dependencies.
- **Lombok** – To reduce boilerplate code.

#### **Frontend:**

- **React.js** – For building the user interface.
- **Vite** – For frontend tooling and development server.
- **React Router** – For client-side routing.
- **Axios** – For making API requests to the backend.

#### **Database:**

- **MySQL** – For relational data storage.

---

## 🚀 Getting Started

Follow these instructions to set up the project locally.

### Prerequisites

- JDK 17 or later
- Maven 3.2+
- Node.js and npm
- MySQL Server

### 1. Fork and Clone the Repository

```bash
git clone https://github.com/Rishisihare90/StayEase.git
cd StayEase
```

### 2. Setup Backend

1.  Navigate to the backend directory:
    ```bash
    cd spring-backend
    ```
2.  **Create your configuration file**:
    - Inside the `src/main/resources/` directory, create a new file named `application.properties`.
3.  **Copy the template**:
    - Open `application-example.properties`, copy all of its content, and paste it into your new `application.properties` file.
4.  **Configure your secrets**:
    - In the **new `application.properties` file**, update the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` to match your local MySQL setup.
    - Set a long, random string for your `secreteJwtString` property.
    - Add your Stripe API keys.
5.  **Run the application**:
    ```bash
    mvn spring-boot:run
    ```
    The backend server will start on `http://localhost:9090`.

### 3. Setup Frontend

1.  Navigate to the frontend directory:
    ```bash
    cd ../react-frontend
    ```
2.  **Install dependencies**:
    ```bash
    npm install
    ```
3.  **Run the development server**:
    ```bash
    npm run dev
    ```
    The React application will be available at `http://localhost:5173`.
