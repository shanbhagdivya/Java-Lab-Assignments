

***Lab Assignment 2***

Part 1: Separating Even and Odd Numbers
File: EvenOddArrays.java
Description: This Java program prompts the user for numbers and organizes them into two arrays, 'even' and 'odd', based on their parity.

Part 2: Finding Nearest Neighbors in an Array
File: NearestNeighbours.java
Description: This Java program includes a method called findNearestNeighbours, which identifies the two neighboring numbers in an array with the smallest distance between them, returning the index of the first number.

Part 3: Converting Array to ArrayList and Vice Versa
File: ArrayToArrayList.java
Description: This Java program illustrates the process of converting an array to an ArrayList and vice versa.

***Lab Assignment 3***

Problem Statement: Write a menu-driven Java Program to study the concepts of classes, and array of objects/arraylist, instance members, and constructors in Java. Assignment description: Create a Student class describing attributes of a student like prn, name, DoB, marks etc. Create an array of objects of Student class and perform operations like Add students, Display, Search. (by prn, by name, by position), Update/Edit and Delete.

Description:

Class Student:

• Constructor: Student(int prn, String name, String dob, float marks) - Initializes a student object.

• Getters: (getPrn, getName, getDob, getMarks) - Access the value of student attributes.

• Setters: (setPrn, setName, setDob, setMarks) - Modify the value of student attributes.

• displayDetails() - Prints formatted details of a student object.

Class StudentDetails:

• Constructor: StudentDetails() - Initializes the studentList.

• addStudent() - Prompts the user for input and adds a new Student object to studentList.

• displayStudents() - Iterates through studentList and displays details of each student.

• searchByPrn(int prn) - Finds and displays a student based on their PRN.

• searchByName(String name) - Finds and displays students matching a given name (case-insensitive).

• searchByPosition(int position) - Retrieves and displays a student at a specific position in studentList.

• updateStudent(int prn) - Finds a student by PRN and allows the user to update their name, date of birth, and marks.

• deleteStudent(int prn) - Deletes a student from studentList based on their PRN.

Class StudentDemo :

• Creates a StudentDetails object.

• Provides a menu-driven interface for the user to interact with the student management system.

***Lab Assignment 6***

Part 1: This code consists of two classes: Main and Result. The Main class contains the main method, which is the entry point of the program. It takes user input for the student's name, roll number, mark 1, and mark 2. It then creates an object of the Result class, passing the user input as arguments. The Result class extends the Student class and implements the InterfaceExam interface. It has two methods: displayExamDetails and Percent_cal.

Part 2: This code consists of two classes: Main and Result. The Main class contains the main method, which is the entry point of the program. It takes user input for the student's name, roll number, mark 1, and mark 2. It then creates an object of the Result class, passing the user input as arguments. The Result class extends the Student class and implements the InterfaceExam interface. It has two methods: displayExamDetails and Percent_cal.

***Lab Assignment 5***

Part 1: This program implements Circle, Triangle, and Rectangle classes inheriting a Shape interface with area() and perimeter() methods. Each shape calculates its specific area and perimeter based on its attributes. Users can select a shape, input parameters, and see calculated area and perimeter.

Part 2: This program simulates an employee payroll system. It defines abstract "Employee" with common details and getter/setter methods. "NormalEmployee" and "BonusEmployee" subclasses inherit Employee and implement their own "theMonthly()" method to calculate net salary based on provided details like gross wage, working days, etc. The "Main" class interacts with users, determines employee type based on bonus, creates the appropriate class object, calculates net salary using "theMonthly()", and prints the payslip using "printPaySlip()".

***Lab Assignment 4***

The task is to create a menu-driven Java program for managing a deck of 52 cards. The program involves two classes: Card and Deck.

The Card class represents individual cards with fields for rank and suit, along with methods for retrieving rank and suit, converting to a string representation, comparing with another card, and checking equality with another object. The Card class also includes arrays for suits and ranks.

The Deck class manages a collection of Card objects using a dynamic array. It has methods for creating a standard deck of 52 cards, displaying a menu for user interaction, printing all cards in the deck, shuffling the deck, drawing a card, emptying the deck, printing a specific card, comparing cards, checking if two cards are the same, finding a card in the deck based on rank and suit, dealing a hand of five cards, and sorting the deck.

The main class initializes a Deck object, populates it with cards, and displays a menu for the user to interact with the deck.


***Lab Assignment 7***

Rational Calculator (assignment7_part1): This software implements a rational number class (RationalNumber) to carry out basic arithmetic operations like addition, subtraction, multiplication, and division on rational numbers. It accepts four command-line arguments representing two rational numbers and performs various operations between them. Instructions for usage: java RationalCalculator

Factorial Calculator (assignment7_part2): This application computes the factorial of a provided number within the range of 0 to 15. It raises a custom exception, FactorialException, if the input number falls outside this range. Instructions for usage: java assignment7_part2 ...

String Matcher (assignment7_part3): This program requests the user to input a string and verifies if it matches the string "India". It throws a custom exception NOMATCHEXCP if the input string does not correspond to "India". No command-line arguments are necessary for usage.


***JDBC***

The "Main" Java program demonstrates how to establish connections to MongoDB, Oracle, and PostgreSQL databases using JDBC and the MongoDB Java driver. The code provides connection details for each database, including URLs, usernames, and passwords. Upon execution, the program attempts to connect to each database and outputs success messages if the connections are established, or error messages if any connection fails. It's essential to ensure that the respective databases are running and accessible with the provided credentials. Additionally, for security reasons, consider using strong passwords and avoiding hardcoding sensitive information directly in the source code.
