import java.io.*;
import java.util.*;

public class EligiblityCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int fitnessScore = scanner.nextInt();
        if (age >=18 && fitnessScore>=60)
            System.out.println("Eligible for marathon");
        else
            System.out.println("Not eligible for marathon");
        scanner.close();
    }
}
