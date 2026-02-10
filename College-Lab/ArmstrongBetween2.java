package Practice;
import java.util.Scanner;

public class ArmstrongBetween2 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int start = number.nextInt();
        System.out.println("Enter the ending number: ");
        int end = number.nextInt();
        System.out.println("Armstrong numbers in the range are:");

        for (int n = start; n <= end; n++) {
            int temp = n;
            int sum = 0;
            int digits = 0;
 
            int countTemp = n;
            while (countTemp != 0) {
                digits++;
                countTemp /= 10;
            }
            temp = n;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == n) {
                System.out.println(n);
            }
        }

    }
}
