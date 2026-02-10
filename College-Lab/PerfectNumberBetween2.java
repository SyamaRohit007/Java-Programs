package Practice;
import java.util.Scanner;

public class PerfectNumberBetween2 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter the starting number: ");
        int start = number.nextInt();

        System.out.println("Enter the ending number: ");
        int end = number.nextInt();

        System.out.println("Perfect numbers in the range are:");

        for (int num = start; num <= end; num++) {

            int sum = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num && num != 0) {
                System.out.println(num);
            }
        }

        
    }
}

