import java.io.*;
import java.util.Scanner;

public class TriangleTypedetector {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a+b>c && b+c>a && c+a>b)  
            {
            if (a==b && b==c)
                System.out.println("Equilateral Triangle");
             else if (a==b || b==c || c==a)
                  System.out.println("Isosceles Triangle");
                else
                   System.out.println("Scalene Triangle");}
        else System.out.println("Not a valid triangle");
}
}
