import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountOfFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++){
            if (N % i == 0){
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
