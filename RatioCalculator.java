import java.util.Scanner;

public class RatioCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.printf("%.6f\n", (double) positive / n);
        System.out.printf("%.6f\n", (double) negative / n);
        System.out.printf("%.6f\n", (double) zero / n);

        sc.close();
    }
}
