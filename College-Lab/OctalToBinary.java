package Practice;
import java.util.Scanner;
public class OctalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter octal number: ");
        int octal = input.nextInt();
        int decimal = 0;
        int power = 0;

        while (octal != 0) {

            int digit = octal % 10;
            decimal = decimal + digit * (int)Math.pow(8, power);
            power++;
            octal = octal / 10;
        }

        int binary = 0;
        int place = 1;

        while (decimal != 0) {

            int remainder = decimal % 2;
            binary = binary + remainder * place;
            place = place * 10;
            decimal = decimal / 2;
        }
        System.out.println("Binary is: " + binary);

    }
}
