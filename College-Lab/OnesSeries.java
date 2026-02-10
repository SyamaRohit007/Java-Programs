package Practice;
import java.util.Scanner;
public class OnesSeries {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Type in the number of 1's in the last digit of interest : ");
		double num = number.nextInt();
		double sum = ((Math.pow(10, num+1))-(9*num)-10)/81.0 ;
		System.out.println("Sum = "+sum);

	}

}
