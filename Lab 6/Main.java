package Assignment_6_part2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = sc.nextLine();

        System.out.println("Enter student roll number:");
        int rollNo = sc.nextInt();

        System.out.println("Enter mark 1:");
        double mark1 = sc.nextDouble();

        System.out.println("Enter mark 2:");
        double mark2 = sc.nextDouble();

        Result result = new Result(name, rollNo, mark1, mark2);
        result.displayExamDetails();

    }
}