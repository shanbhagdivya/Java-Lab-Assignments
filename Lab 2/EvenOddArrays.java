import java.util.Scanner;

public class EvenOddArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] even = new int[n]; // Array to store even numbers
        int[] odd = new int[n]; // Array to store odd numbers

        int evenCount = 0; // Counter for even numbers
        int oddCount = 0; // Counter for odd numbers

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                even[evenCount++] = num; // Store even number in 'even' array
            } else {
                odd[oddCount++] = num; // Store odd number in 'odd' array
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }

        scanner.close();
    }
}
