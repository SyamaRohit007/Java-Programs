package Practice;
import java.util.Scanner ;
public class Factorial {

	public static void main(String[] args) {
		int product = 1;
		Scanner number = new Scanner(System.in);
		System.out.println("Type in the number : ");
		int num = number.nextInt();
		for (int i = 1 ; i<=num ; i++) {
			product = product*i ; 
		}
		System.out.println("The factorial of "+num+" is : "+product);

	}

}
