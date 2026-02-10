package Practice;
import java.util.Scanner;
public class LCMUsingHCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int hcf = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        int lcm = (a * b) / hcf;
        System.out.println("HCF is: " + hcf);
        System.out.println("LCM is: " + lcm);
    }
}
