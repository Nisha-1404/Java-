import java.io.*;
import java.util.Scanner;

public class CharacterClassifier {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if (ch>=65 && ch<=91)
            System.out.println("Uppercase Alphabet");
        else if (ch >=97 && ch<=122)
            System.out.println("Lowercase Alphabet");
        else if (ch >=49 && ch<=57)
            System.out.println("Digit");
        else 
            System.out.println("Special Character");
    }
}
