import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candles = new int[n];

        for (int i = 0; i < n; i++) {
            candles[i] = sc.nextInt();
        }
        int maxHeight = candles[0];
        for (int i = 1; i < n; i++) {
            if (candles[i] > maxHeight) {
                maxHeight = candles[i];
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (candles[i] == maxHeight) {
                count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}
