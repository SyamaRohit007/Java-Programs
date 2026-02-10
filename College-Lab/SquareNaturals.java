package Practice;
import java.util.Scanner ;
public class SquareNaturals {
	public static void main(String[]args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Type in the number of naturals : ");
		int num = number.nextInt();
		int sum = 0;
		for (int i = 1 ; i<=num ; i++) {
			System.out.print(i*i + " ");
			sum+=Math.pow(i, 2);
			
		}
		System.out.print("Sum = "+sum);
	}
}
 