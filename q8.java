/*Write a recursive method in Java which, given an integer n, print it with its digits reversed.
For example, given 4735, it prints 5374*/
package Assignment_3;
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Reverse of "+num+" is:");
        int rev = reverse(num);
    } 
    public static int reverseDigit(int number){
        if(number<10){
            System.out.print(number);
            return number;
        }
        else{
            System.out.print(number%10);
            return reverse(number/10);
        }
    }
}
