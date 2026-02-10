package Practice;
import java.util.Scanner ;
public class SumOfGP {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Type in the first term of the series : ");
		int a = number.nextInt() ;
		System.out.print("Type in the common ratio of the series : ");
		int r = number.nextInt() ;
		System.out.print("Type in the number of terms in the series : ");
		int n = number.nextInt() ;
		double sum = (((Math.pow(r, n))-1)*(a))/(r-1);
		System.out.print("Sum = "+sum) ;
	}

}