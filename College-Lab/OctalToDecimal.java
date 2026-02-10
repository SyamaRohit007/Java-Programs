package Practice;
import java.util.Scanner;
public class OctalToDecimal {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int octal = input.nextInt();
        int decimal = 0;
        int power = 0;

        while (octal != 0) {
            int digit = octal % 10;
            decimal = decimal + digit * (int)Math.pow(8, power);
            power++;
            octal = octal / 10;
        }
        System.out.println("Decimal is: " + decimal);

    }
}
