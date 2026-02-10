package Practice;
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = input.nextInt();
        System.out.print("Late payment? (yes=1 / no=0): ");
        int late = input.nextInt();
        double bill = 10; // base charge
        if (units <= 100) {
            bill += units * 0.5;
        } 
        else if (units <= 300) {
            bill += (100 * 0.5) + ((units - 100) * 0.75);
        } 
        else {
            bill += (100 * 0.5) + (200 * 0.75) + ((units - 300) * 1.2);
        }
        if (late == 1) {
            bill += bill * 0.05;
        }
        System.out.println("Total Bill: $" + bill);
        input.close();
    }
}
