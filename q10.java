/*Write a recursive Java method that takes a character string s and outputs its reverse.
For example, the reverse of ' pots&pans' would be ' snap&stop'.*/
package Assignment_3;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseString(s));
    }
    public static  String reverseString(String s){
        if(s == null||s.length()<=1){
            return s;
        }
        return reverseString(s.substring(1))+s.charAt(0);
    }
}
