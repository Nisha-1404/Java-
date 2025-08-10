import java.io.*;
import java.util.*;

public class SumOfOddAndEvenDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        n = Math.abs(n);
        int sumOdd = 0;
        int sumEven = 0;
        while (n>0){
            int digit = (int)(n%10);
            if(digit %2 == 0){
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            n/=10;
        }
        System.out.println(sumOdd + " " + sumEven);
    }
}
