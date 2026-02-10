package Practice;
import java.util.Scanner ;
public class SumOfNumber {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Type in the number of naturals : ");
		int num = number.nextInt();
		int sum = 0;
		for(int i = 1; i<=num ; i++ ) {
			sum+=i ;
		}
		System.out.print("The sum of natural numbers upto "+num + " terms is : "+sum);

	}

}
