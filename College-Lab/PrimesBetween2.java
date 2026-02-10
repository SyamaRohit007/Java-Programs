package Practice;
import java.util.Scanner;
public class PrimesBetween2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int start = number.nextInt();
        System.out.println("Enter the ending number: ");
        int end = number.nextInt();
        System.out.println("Prime numbers in the range are:");

        for (int i = start; i <= end; i++) {
            if (i <= 1) {
                continue; // skip 0 and 1
            }
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i + " is a Prime Number!");
            }
        }
    }
}
