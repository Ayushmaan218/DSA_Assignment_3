/*Write a menu driven program to perform several mathematical operations. Different choices
for the mathematical operations are as follows.
1. Determine the factorial of a number
2. Determine XN
for two numbers X, N
3. Determine GCD of two number.
4. Binary equivalent of a decimal number
5. Product of two numbers.
NOTE: All the mathematical operations must be performed using the recursive method.*/
package Assignment_3;
import java.util.*;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Mathematical Operations Menu:");
            System.out.println("1. Determine the factorial of a number");
            System.out.println("2. Determine X^N for two numbers X, N");
            System.out.println("3. Determine GCD of two numbers");
            System.out.println("4. Binary equivalent of a decimal number");
            System.out.println("5. Product of two numbers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    long factorial = calculateFactorial(num);
                    System.out.println("Factorial of " + num + " is: " + factorial);
                    break;
                case 2:
                    System.out.print("Enter base number (X): ");
                    int x = sc.nextInt();
                    System.out.print("Enter exponent (N): ");
                    int n = sc.nextInt();
                    long result = calculatePower(x, n);
                    System.out.println(x + "^" + n + " is: " + result);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = sc.nextInt();
                    int gcd = calculateGCD(num1, num2);
                    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
                    break;
                case 4:
                    System.out.print("Enter a decimal number: ");
                    int decimal = sc.nextInt();
                    String binary = calculateBinary(decimal);
                    System.out.println("Binary equivalent of " + decimal + " is: " + binary);
                    break;
                case 5:
                    System.out.print("Enter first number: ");
                    int number1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int number2 = sc.nextInt();
                    long product = calculateProduct(number1, number2);
                    System.out.println("Product of " + number1 + " and " + number2 + " is: " + product);
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
        while (choice != 0);
        sc.close();
    }
    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }

    public static long calculatePower(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * calculatePower(x, n - 1);
        }
    }

    public static int calculateGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return calculateGCD(num2, num1 % num2);
        }
    }

    public static String calculateBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            return calculateBinary(decimal / 2) + (decimal % 2);
        }
    }

    public static long calculateProduct(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 + calculateProduct(num1, num2 - 1);
        }
    }
}
