package Practice;
import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to be checked : ");
        int num = input.nextInt();
        int n = num ;
        int sum = 0 ;
        while(num!=0) {
        	int digit = num%10 ; 
        	int product = 1;
        	for (int i =1 ; i<=digit ; i++) {
        		product = product*i;
        	}
        	num = num/10 ;
        	sum+=product ;
        	
        }
        if(n==sum) {
        	System.out.print("The given number "+sum +" is a Strong Number" );
        }
        else {
        	System.out.print("The given number "+n +" is not a Strong Number" );
        }
        
	}

}
