import java.util.Scanner;

public class FindAllIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("-1");
        }

        sc.close();
    }
}
