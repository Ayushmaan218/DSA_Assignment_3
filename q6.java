/*Write a simple main class in Java that contains an experiment that uses the generic Box<T>
class to build boxes with different types and that verifies that this class works as advertised.
Your experiment should include the following:
 Create a boxed String object and two variables that refer to that box. Change the contents
of one and determine the effect on the other.
 Create a boxed Integer object and two variables that refer to that box. Change the
contents of one and determine the effect on the other.
 Create a boxed Object object and two variables that refer to that box. Determine what
happens if you put a string in the box. Determine what happens if you put an integer in
the box.*/
package Assignment_3;
public class q6 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box("Hello");
        Box<String> anotherStringBox = stringBox;
        stringBox.setContents("World");
        System.out.println(stringBox.getContents());               
        System.out.println(anotherStringBox.getContents());
        
        Box<Integer> integerBox = new Box<>(10);
        Box<Integer> anotherIntegerBox = integerBox;

        
        integerBox.setContents(20);
        System.out.println(integerBox.getContents());              
        System.out.println(anotherIntegerBox.getContents());       

        
        Box<Object> objectBox = new Box<>(new Object());
        Box<Object> anotherObjectBox = objectBox;

        
        objectBox.setContents("Hello");
        System.out.println(objectBox.getContents());               
        System.out.println(anotherObjectBox.getContents());        

        
        objectBox.setContents(30);
        System.out.println(objectBox.getContents());               
        System.out.println(anotherObjectBox.getContents());        
    }
}

class Box<T> {
    private T contents;

    public Box(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }
    
}
