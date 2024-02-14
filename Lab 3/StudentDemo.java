import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDetails studentDetails = new StudentDetails();

        int choice;
        do {

            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    studentDetails.addStudent();
                    break;
                case 2:
                    studentDetails.displayStudents();
                    break;
                case 3:
                    System.out.println("Search Options:");
                    System.out.println("1. By PRN");
                    System.out.println("2. By Name");
                    System.out.println("3. By Position");
                    System.out.print("Enter your choice: ");
                    int searchChoice = sc.nextInt();

                    switch (searchChoice) {
                        case 1:
                            System.out.print("Enter PRN to search: ");
                            studentDetails.searchByPrn(sc.nextInt());
                            break;
                        case 2:
                            sc.nextLine();
                            System.out.print("Enter Name to search: ");
                            studentDetails.searchByName(sc.nextLine());
                            break;
                        case 3:
                            System.out.print("Enter Position to search: ");
                            studentDetails.searchByPosition(sc.nextInt());
                            break;
                        default:
                            System.out.println("Invalid search choice.");
                    }
                    break;
                case 4:
                    System.out.print("Enter PRN to update: ");
                    studentDetails.updateStudent(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter PRN to delete: ");
                    studentDetails.deleteStudent(sc.nextInt());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}