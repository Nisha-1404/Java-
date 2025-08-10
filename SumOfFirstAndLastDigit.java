import java.util.Scanner;

public class import java.util.Scanner;

public class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        N = Math.abs(N);

        int lastDigit = N % 10;
        int firstDigit = N;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        int sum = firstDigit + lastDigit;
        System.out.println(sum);
    }
}
