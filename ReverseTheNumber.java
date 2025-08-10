import java.io.*;
import java.util.Scanner;

public class ReverseTheNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = 0;
        if(N<0){
             System.out.print("-");
             N=N*-1;
        }
        if(N==0)
            r = 0;
        while(N!=0)
        {
             r = r * 10 + (N%10);
             N/=10;   
        }
            System.out.print(r);
        
    }
}
