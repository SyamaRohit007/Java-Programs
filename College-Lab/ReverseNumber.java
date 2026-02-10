package Practice ;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
            
        }
        
        System.out.print(reverse);


        
    }
}
