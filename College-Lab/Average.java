package Practice;
import java.util.Scanner ;
public class Average {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		float sum = 0 ;
		for (int i = 1 ; i<=10 ; i++) {
			System.out.print("Type in the number : ");
			int num = number.nextInt();
			sum+=num ;
			
		}
		System.out.println("Sum = "+sum + " and the Average is : "+(sum/10)) ;
		

	}

}
