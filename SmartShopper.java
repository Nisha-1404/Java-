import java.util.Scanner;;
import java.text.DecimalFormat;

public class SmartShopper {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalBeforeTax = 0.0;
        int cost1 = scan.nextInt();
        int quantity1 = scan.nextInt();
        totalBeforeTax += (double) cost1 * quantity1;
        int cost2 = scan.nextInt();
        int quantity2 = scan.nextInt();
        totalBeforeTax += (double) cost2 * quantity2;
        int cost3 = scan.nextInt();
        int quantity3 = scan.nextInt();
        totalBeforeTax += (double) cost3 * quantity3;
        int budget = scan.nextInt();
        double taxRate = 0.10;
        double totalAfterTax = totalBeforeTax * (1 + taxRate);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Total (Before Tax): " + df.format(totalBeforeTax));
        System.out.println("Total (After Tax): " + df.format(totalAfterTax));
        if (totalAfterTax <= budget){
            System.out.println("Within Budget");
        } else {
            System.out.println("Over Budget");
        }
        scan.close();
    }
}
