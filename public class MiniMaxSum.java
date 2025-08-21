import java.util.*;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
        }
         Arrays.sort(arr);
        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr[i];
        }
        for (int i = 1; i < 5; i++) {
            maxSum += arr[i];
        }
        System.out.println(minSum + " " + maxSum);
    }
}
