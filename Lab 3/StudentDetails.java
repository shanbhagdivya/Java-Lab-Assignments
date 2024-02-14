import java.util.*;
public class StudentDetails {
    private ArrayList<Student> studentList;

    public StudentDetails(){
        studentList = new ArrayList<>();
    }

    public void addStudent()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nHow many students do you want to enter: ");
        int totalEnter = sc.nextInt();

        for(int i=0; i<totalEnter; i++)
        {
            System.out.print("\nPRN: ");
            int prn = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Total Marks: ");
            float marks = sc.nextFloat();

            System.out.print("DOB: ");
            String dob = sc.next();

            studentList.add(new Student(prn, name, dob, marks));
        }
    }

    public void displayStudents(){
        for (Student student : studentList) {
            int prn = student.getPrn();
            String name = student.getName();
            String dob = student.getDob();
            float marks = student.getMarks();

            System.out.print("\n\nPRN: " + prn + "\nName: " + name + "\nDOB: " + dob + "\nMarks: " + marks);
        }
    }

    public void searchByPrn(int prn) {
        boolean found = false;
        for (Student student : studentList) {
            if (student.getPrn() == prn) {
                student.displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with PRN " + prn + " not found.");
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student with name " + name + " not found.");
        }
    }

    public void searchByPosition(int position) {
        if (position >= 1 && position <= studentList.size()) {
            studentList.get(position - 1).displayDetails();
        } else {
            System.out.println("Invalid position.");
        }
    }

    public void updateStudent(int prn) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        for (Student student : studentList) {
            if (student.getPrn() == prn) {
                System.out.print("Enter New Name: ");
                String newName = sc.nextLine();
                student.setName(newName);

                System.out.println("Update Date of Birth? (yes/no): ");
                String updateDobChoice = sc.nextLine();
                if (updateDobChoice.equalsIgnoreCase("yes")) {
                    String newDob = sc.nextLine();
                    student.setDob(newDob);
                }

                System.out.println("Update Marks? (yes/no): ");
                String updateMarksChoice = sc.nextLine();
                if (updateMarksChoice.equalsIgnoreCase("yes")) {
                    System.out.print("Enter new marks: ");
                    float newMarks = sc.nextFloat();
                    student.setMarks(newMarks);
                }

                System.out.println("Student updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with PRN " + prn + " not found.");
        }
    }

    public void deleteStudent(int prn) {
        boolean found = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getPrn() == prn) {
                studentList.remove(i);
                System.out.println("Student deleted successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with PRN " + prn + " not found.");
        }
    }
}
