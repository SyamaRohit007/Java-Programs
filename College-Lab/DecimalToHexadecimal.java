package Practice;
import java.util.Scanner;
public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int num = input.nextInt();
        String hex = "";
        while (num != 0) {
            int remainder = num % 16;
            if (remainder < 10)
                hex = remainder + hex;
            else
                hex = (char)(remainder + 55) + hex;
            num = num / 16;
        }
        System.out.println("Hexadecimal is: " + hex);
        input.close();
    }
}
