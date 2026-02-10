package Practice;
import java.util.Scanner;
public class BinaryToOctal {
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

        int octal = 0;
        int place = 1;
        while (decimal != 0) {
            int remainder = decimal % 8;
            octal = octal + remainder * place;
            place = place * 10;
            decimal = decimal / 8;
        }
        System.out.println("Octal is: " + octal);
    }
}

