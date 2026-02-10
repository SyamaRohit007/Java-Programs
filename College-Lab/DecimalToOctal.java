package Practice;
import java.util.Scanner;
public class DecimalToOctal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int num = input.nextInt();
        int octal = 0;
        int place = 1;

        while (num != 0) {
            int remainder = num % 8;
            octal = octal + remainder * place;
            place = place * 10;
            num = num / 8;
        }
        System.out.println("Octal is: " + octal);
    }
}
