package Practice;
import java.util.Scanner ; 
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Type in the number to be checked : ");
		int n = number.nextInt();
		int sum = 0 ;
		int n1=n;
		while (n!= 0) {
			double digit = Math.pow(n%10, 3) ;
			sum+=(digit);
			n = n/10 ;
		}
		if (sum == n1) {
			System.out.println("It is an Armstrong number !");
		}
		else {
			System.out.println("It is not an Armstrong number !");
		}
	}

}
