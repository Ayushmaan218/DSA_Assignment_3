/*Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler.*/
package Assignment_3;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter your lucky number");
            int luckyNumber = Integer.parseInt(sc.nextLine());

            if (luckyNumber < 0) {
                throw new NumberFormatException("Lucky number cannot be negative.");
            }

            System.out.println("Your lucky number is " + luckyNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
