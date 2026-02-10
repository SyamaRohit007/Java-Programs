package Practice;
import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int n = num ;
        int reverse = 0 ;
        while(num!=0) {
        	int digit = num%10 ;
        	reverse = 10*reverse+digit ;
        	num=num/10 ;
        			
        }
        if(reverse == num) {
        	System.out.println(n+" is a Palindrome Number . ");
        }
        else {
        	System.out.println(n+" is not a Palindrome Number . ");
        }
	}
}
