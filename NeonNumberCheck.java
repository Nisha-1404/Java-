import java.util.Scanner;

public class NeonNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int square = N * N;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        System.out.println(sum == N);
    }
}
