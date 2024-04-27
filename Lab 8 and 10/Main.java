import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.*;
public class Main extends Application {
// JDBC URL, username, and password
static final String JDBC_URL =
"jdbc:mysql://localhost:3306/employeemanagementsystem?user=host&password=(
(#root_123))";
static final String USERNAME = "host";
static final String PASSWORD = "((#root_123))";
@Override
public void start(Stage primaryStage) {
// Establish database connection
try {
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("MySQL JDBC Driver registered.");
} catch (ClassNotFoundException e) {
System.out.println("Failed to register MySQL JDBC Driver.
Error: " + e.getMessage());
return;
}
// UI elements
ASSIGNMENT 8 and ASSIGNMENT 10
The application should allow users to input employee details such as employee ID, name, age, email, and
department. Design a user-friendly interface using JavaFX that allows users to input
employee details. Include text fields for entering employee ID, name, age, email and department. Add buttons
for creating an employee table before registering an employee, viewing the list of registered employees,
update information about employee based on Employee ID.
Main.java
TextField idField = new TextField();
idField.setPromptText("Employee ID"); TextField
nameField = new TextField();
nameField.setPromptText("Name"); TextField ageField =
new TextField(); ageField.setPromptText("Age"); TextField
emailField = new TextField();
emailField.setPromptText("Email");
TextField departmentField = new TextField(); departmentField.setPromptText("Department");
Button registerButton = new Button("Register Employee"); Button viewButton = new
Button("View Employees");
Button updateButton = new Button("Update Employee");
VBox root = new VBox(10); root.getChildren().addAll(idField, nameField, ageField,
emailField, departmentField, registerButton, viewButton, updateButton);
Scene scene = new Scene(root, 300, 250); primaryStage.setScene(scene);
primaryStage.setTitle("Employee Management System"); primaryStage.show();
// Register employee button action
registerButton.setOnAction(event -> {
// Retrieve employee details from text fields int id =
Integer.parseInt(idField.getText()); String name =
nameField.getText();
int age = Integer.parseInt(ageField.getText()); String email =
emailField.getText();
String department = departmentField.getText();
// Insert employee into database registerEmployee(id, name, age, email,
department);
});
// View employees button action
viewButton.setOnAction(event-> {
// View employees from database
viewEmployees();
});
// Update employee button action
updateButton.setOnAction(event -> {
// Retrieve employee details from text fields int id =
Integer.parseInt(idField.getText()); String name =
nameField.getText();
int age = Integer.parseInt(ageField.getText()); String email =
emailField.getText();
String department = departmentField.getText();
// Update employee in database
updateEmployee(id, name, age, email, department);
});
}
// Method to register employee into the database
private void registerEmployee(int id, String name, int age, String email, String department) {
String insertQuery = "INSERT INTO Employee (id, name, age, email, department) VALUES (?, ?, ?, ?,
?)";
try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME,
PASSWORD);
PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
preparedStatement.setInt(1, id); preparedStatement.setString(2, name);
preparedStatement.setInt(3, age); preparedStatement.setString(4, email);
preparedStatement.setString(5,department);
int rowsAffected = preparedStatement.executeUpdate(); System.out.println(rowsAffected + " row(s) inserted.");
} catch (SQLException e) {
System.out.println("Failed to register employee. Error: " + e.getMessage());
}
}
// Method to view employees from the database private void viewEmployees() {
String selectQuery = "SELECT * FROM Employee";
try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME,
PASSWORD);
Statement statement = connection.createStatement(); ResultSet resultSet =
statement.executeQuery(selectQuery)) {
System.out.println("Employeedetails:"); while (resultSet.next()) {
int id = resultSet.getInt("id");
String name = resultSet.getString("name"); int age =
resultSet.getInt("age");
String email = resultSet.getString("email");
String department = resultSet.getString("department");
System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Email: " + email +
", Department: " + department);
}
} catch (SQLException e) {
System.out.println("Failed to retrieve employee details.
Error: " + e.getMessage());
}
}
// Method to update employee information in the database based on Employee ID
private void updateEmployee(int id, String name, int age, String email, String department) {
String updateQuery = "UPDATE Employee SET name=?, age=?, email=?, department=? WHERE
id=?";
try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME,
PASSWORD);
PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
preparedStatement.setString(1,name); preparedStatement.setInt(2, age);
Output:-
preparedStatement.setString(3, email);
preparedStatement.setString(4, department);
preparedStatement.setInt(5, id);
int rowsAffected = preparedStatement.executeUpdate();
System.out.println(rowsAffected + " row(s) updated.");
} catch (SQLException e) {
System.out.println("Failed to update employee. Error: " +
e.getMessage());
}
}
public static void main(String[] args) {
launch(args);
}
}
