/*Create a class Student having two instance variable name and mark. Enter mark, name of the
student. If mark is more than 100, create exception MarksOutOfBoundException & throw it
using Java. Display the customised message Mark can’t be greater than 100 for the exception.*/
package Assignment_3;
import java.util.*;
class MarksOutOfBoundException extends Exception{
    MarksOutOfBoundException(String message){
        super(message);
    }
}
public class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the Student: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        try{
            int mark = sc.nextInt();
            if(mark>100){
                throw new MarksOutOfBoundException("Mark can't be greater than 100");
            }
            System.out.println(name+" "+mark);
        }
        catch(MarksOutOfBoundException e){
            System.out.println(e);
        }
    }
}