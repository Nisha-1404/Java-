import java.io.*;
import java.util.Scanner;

public class DigitalCounter {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c = 0;
        if(N==0){
            c=1;
            System.out.println(c);
        } 
        else {
        while(N!=0)
        {
            c++;
            N = N/10;
        }
        System.out.println(c);
        }
    }
}
