# Shopping Website

This project is a web-based shopping website that consists of a backend, frontend, and a separate database. The backend is built using Java with Spring Boot, while the frontend is developed using React. The two communicate through RESTful web services.

## Project Structure

- **backend/**: Contains the server-side application.
  - **src/**: Source code for the backend application.
    - **main/**: Main application code.
      - **java/com/example/shopping/**: Java packages for controllers, models, repositories, and services.
      - **resources/**: Configuration files and resources.
  - **pom.xml**: Maven configuration file for managing dependencies and build settings.

- **frontend/**: Contains the client-side application.
  - **public/**: Static files served by the frontend.
  - **src/**: Source code for the frontend application.
    - **components/**: Reusable React components.
    - **pages/**: Components representing different pages of the application.
    - **services/**: JavaScript files for handling API calls.
    - **App.js**: Main entry point of the React application.
  - **package.json**: npm configuration file for managing frontend dependencies.

- **database/**: Contains SQL scripts for database schema.
  - **schema.sql**: SQL statements for creating the database schema.

## Setup Instructions

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd shopping-website
   ```

2. **Backend Setup**:
   - Navigate to the `backend` directory.
   - Ensure you have Java and Maven installed.
   - Run the following command to build the backend:
     ```
     mvn clean install
     ```
   - Configure the `application.properties` file with your database connection details.
   - Start the backend server:
     ```
     mvn spring-boot:run
     ```

3. **Frontend Setup**:
   - Navigate to the `frontend` directory.
   - Ensure you have Node.js and npm installed.
   - Install the frontend dependencies:
     ```
     npm install
     ```
   - Start the frontend application:
     ```
     npm start
     ```

## Usage

Once both the backend and frontend are running, you can access the shopping website at `http://localhost:3000`. You can manage products, users, and orders through the web interface.

## Contributing

Feel free to submit issues or pull requests to improve the project.