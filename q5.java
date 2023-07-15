/*Write a java method using Generics to count the occurrence of an element in an array of any
type. The signature of count method is given below.
public static <T> int count(T[] array, T item)*/
package Assignment_3;
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element");
        Integer[] arr = new Integer[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int s = sc.nextInt();
        int count = count(arr, s);
        System.out.println("Count of " + s + " in the array: " + count);
        
        sc.close();
    }
    public static <T> int count(T[] array,T item){
        int count = 0;
        for(int i =0;i<array.length;i++){
            if(array[i]==item){
                return count;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
