import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrintOrderReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1;i <= N; i++){
            System.out.print(i + " ");
        }
        for (int i = N;i >= 1; i--){
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
