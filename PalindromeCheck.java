import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 0) {
            System.out.println(false);
            return;
        }

        int original = N;
        int reversed = 0;

        while (N > 0) {
            int digit = N % 10;
            reversed = reversed * 10 + digit;
            N /= 10;
        }
        System.out.println(original == reversed);
    }
}
