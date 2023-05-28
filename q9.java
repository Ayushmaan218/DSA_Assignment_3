/*The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers,
each is the sum of the preceding two. Write a recursive method in Java which, given n,
returns the nth Fibonacci number.*/
package Assignment_3;

import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Fibonacci number at position "+num+" is "+Fibonacci(num));
    }
    public  static  int Fibonacci(int number){
        if(number==0||number==1){
            return  number;
        }
        return Fibonacci(number - 1) + Fibonacci(number - 2);
    }
}