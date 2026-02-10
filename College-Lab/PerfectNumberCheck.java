package Practice;
import java.util.Scanner;
public class PerfectNumberCheck {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Type in the number to be checked : ");
		int num = number.nextInt();
		int sum = 0 ;
		for (int i = 1 ; i<num ; i++) {
			if (num%i==0) {
				sum+=i ;
			}
			
		}
		if (sum==num) {
			System.out.print(num+" is a Perfect Number !");
		}
		else {
			System.out.print("It is not a Perfect Number :(");
		}
	}

}
