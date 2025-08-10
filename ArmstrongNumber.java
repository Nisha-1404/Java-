import java.util.Scanner;
import java.io.*;

public class ArmstrongNumber {
  public static int count(int n){
      int c=0;
      while (n!=0){
         c++;
         n/=10;
  }
  return c;
  }
  
  public static int findsum(int n,int c){
      int sum =0;
      while(n!=0)
      {
          int last = n%10;
          int exp = (int)Math.pow(last,c);
          sum = sum+exp;
          n/=10;}
          return sum;
      }
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int c = count(n);
      int sum = findsum(n,c);
      if(sum==n)
          System.out.println("true");
      else
          System.out.println("false");
  }
}
