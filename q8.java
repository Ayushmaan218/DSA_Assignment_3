/*Write a recursive method in Java which, given an integer n, print it with its digits reversed.
For example, given 4735, it prints 5374*/
package Assignment_3;
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = reverseDigit(num);
        System.out.println("Reverse of "+num+" is"+rev);
    } 
    public static int reverseDigit(int number){
        if(number<10){
            return number;
        }
        int lastDigit = number % 10;
        int remainingDigits = number / 10;
        int reversedNumber = reverseDigit(remainingDigits);
        int numOfDigits = (int) Math.log10(reversedNumber) + 1;
        reversedNumber += lastDigit * Math.pow(10, numOfDigits);
        return reversedNumber;
    }
}
