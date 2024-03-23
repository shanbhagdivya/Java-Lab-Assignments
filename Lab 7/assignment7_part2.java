class FactorialException extends Exception {
    private int number;

    public FactorialException(int number) {
        super("FactorialException: Input number '" + number + "' is out of range (0-15).");
        this.number = number;
    }

    @Override
    public String toString() {
        return getMessage();
    }
}

public class assignment7_part2 {
    public static void main(String[] args) {
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                factorial(num);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: '" + arg + "' is not a valid integer.");
            } catch (FactorialException e) {
                System.out.println(e);
            }
        }
    }

    public static void factorial(int n) throws FactorialException {
        if (n < 0 || n > 15) {
            throw new FactorialException(n);
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
