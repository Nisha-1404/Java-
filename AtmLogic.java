import java.io.*;
import java.util.*;

public class AtmLogic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        scanner.nextLine();
        String noteStatus = scanner.nextLine();
        boolean canWithdraw = false;
        String errorMessage = "Enter amount in multiples of 500";
        if (noteStatus.equals("available")){
            if (amount % 100 == 0) {
                canWithdraw = true;
            }
        } else if (noteStatus.equals("not available")) {
            if (amount % 500 == 0){
                canWithdraw = true;
            }
        }
        if (canWithdraw){
            System.out.println("Amount " + amount + " can be withdrawn");
        } else {
            System.out.println(errorMessage);
        }
        scanner.close();
    }
}
