import java.io.*;
import java.util.*;

public class Meet the Person {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age = scan.nextInt();
        float height = scan.nextFloat();
        String name = scan.next();
        System.out.printf("%s is %d years old and %.2f meters tall.",name,age,height);
        
    }
}
