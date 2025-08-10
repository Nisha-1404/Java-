import java.util.Scanner;

public class AutomorphicCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long square = (long) n * n;
        int temp = n;
        boolean isAutomorphic = true;

        while (temp > 0) {
            if (square % 10 != temp % 10) {
                isAutomorphic = false;
                break;
            }
            square /= 10;
            temp /= 10;
        }

        if (isAutomorphic) {
            System.out.println("Automorphic");
        } else {
            System.out.println("Not Automorphic");
        }
    }
