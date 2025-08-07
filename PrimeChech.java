import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrimeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (isPrime(N)){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for (int i = 3;i <= Math.sqrt(n);i+=2){
            if(n % i == 0) return false;
        }
        return true;
    }
}
