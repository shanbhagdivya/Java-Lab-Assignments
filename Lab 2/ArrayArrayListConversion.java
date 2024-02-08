import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayArrayListConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion:");
        System.out.println("1. Array to ArrayList");
        System.out.println("2. ArrayList to Array");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                arrayToArrayList();
                break;
            case 2:
                arrayListToArray();
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    public static void arrayToArrayList() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        Integer[] array = new Integer[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        List<Integer> arrayList = Arrays.asList(array);
        System.out.println("ArrayList: " + arrayList);

        scanner.close();
    }

    public static void arrayListToArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the ArrayList: ");
        int size = scanner.nextInt();
        List<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter the elements of the ArrayList:");
        for (int i = 0; i < size; i++) {
            arrayList.add(scanner.nextInt());
        }

        Integer[] array = arrayList.toArray(new Integer[0]);
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
