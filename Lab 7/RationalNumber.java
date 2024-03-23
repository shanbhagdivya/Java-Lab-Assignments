import java.util.Scanner;

class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public RationalNumber add(RationalNumber other) {
        int newNumerator = numerator * other.denominator + other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber subtract(RationalNumber other) {
        int newNumerator = numerator * other.denominator - other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber multiply(RationalNumber other) {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber divide(RationalNumber other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        int newNumerator = numerator * other.denominator;
        int newDenominator = denominator * other.numerator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public RationalNumber abs() {
        return new RationalNumber(Math.abs(numerator), denominator);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}

public class assignment7_part1 {
    public static void main(String[] args) {
        try {
            if (args.length != 4) {
                throw new IllegalArgumentException("Invalid number of arguments. Usage: java RationalCalculator <num1> <den1> <num2> <den2>");
            }

            int num1 = Integer.parseInt(args[0]);
            int den1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);
            int den2 = Integer.parseInt(args[3]);

            RationalNumber rational1 = new RationalNumber(num1, den1);
            RationalNumber rational2 = new RationalNumber(num2, den2);

            System.out.println("Rational 1: " + rational1);
            System.out.println("Rational 2: " + rational2);
            System.out.println("Sum: " + rational1.add(rational2));
            System.out.println("Difference: " + rational1.subtract(rational2));
            System.out.println("Product: " + rational1.multiply(rational2));
            System.out.println("Quotient: " + rational1.divide(rational2));
            System.out.println("Comparison: " + (rational1.toDouble() == rational2.toDouble() ? "Equal" : "Not Equal"));
            System.out.println("Absolute Value of Rational 1: " + rational1.abs());
            System.out.println("Absolute Value of Rational 2: " + rational2.abs());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

}
