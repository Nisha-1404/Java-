import java.util.Scanner;
public class EvenOddElemtsAndIndexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenElementSum = 0;
        int oddElementSum = 0;
        int evenIndexSum = 0;
        int oddIndexSum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenElementSum += arr[i];
            } else {
                oddElementSum += arr[i];
            }
            if (i % 2 == 0) {
                evenIndexSum += arr[i];
            } else {
                oddIndexSum += arr[i];
            }
        }
        System.out.println(evenElementSum + " " + oddElementSum + " " + evenIndexSum + " " + oddIndexSum);

        sc.close();
    }
}
