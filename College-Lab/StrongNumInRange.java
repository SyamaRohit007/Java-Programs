package Practice;
import java.util.Scanner;
public class StrongNumInRange {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = input.nextInt();
        System.out.print("Enter ending number: ");
        int end = input.nextInt();

        System.out.println("Strong numbers in the range are:");
        for (int num = start; num <= end; num++) {
            int n = num;
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                int product = 1;
                for (int i = 1; i <= digit; i++) {
                    product = product * i;
                }
                sum += product;
                n = n / 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
