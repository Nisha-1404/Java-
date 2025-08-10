import java.io.*;
import java.util.*;

public class MaximumAndMinimumDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        n = Math.abs(n);
        int maxDigit = 0;
        int minDigit = 9;
        if (n == 0){
            maxDigit = minDigit = 0;
        } else {
            while (n>0){
                int digit = (int)(n%10);
                if(digit > maxDigit)maxDigit = digit;
                if(digit < minDigit)minDigit = digit;
                n/=10;
            }
        }
        System.out.println(maxDigit + " " + minDigit);
    }
}
