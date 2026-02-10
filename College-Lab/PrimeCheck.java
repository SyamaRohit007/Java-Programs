package Practice;
import java.util.Scanner;
public class PrimeCheck {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
        System.out.println("Enter the number to be checked : ");
        int num = number.nextInt();
        int sum = 0 ;
        for (int i = 1 ; i<num ; i++) {
        	if(num%i==0) {
        		sum+=i ;
        	}
        }
        if(sum==0) {
        	System.out.println(num+" is a Prime Number !");
        }
        else {
        	System.out.println(num+" is not a Prime Number !");
        }
	}
	

}
