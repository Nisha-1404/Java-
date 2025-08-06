import java.io.*;
import java.util.Scanner;

public class Leapyearchecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}
     
