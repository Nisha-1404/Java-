import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumAndFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int factorial = 1;
        for (int i = 1;i <= N; i++){
            sum+= i;
            factorial *= i;
        }
        System.out.println(sum);
        System.out.println(factorial);
    }
}
