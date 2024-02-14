

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
