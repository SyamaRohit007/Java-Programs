package Practice;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int binary = input.nextInt();
        int decimal = 0;
        int power = 0;

        while (binary != 0) {
            int digit = binary % 10;
            decimal = decimal + digit * (int)Math.pow(2, power);
            power++;
            binary = binary / 10;
        }
        System.out.println("Decimal is: " + decimal);

    }
}
