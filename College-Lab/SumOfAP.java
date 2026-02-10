package Practice;
import java.util.Scanner ;
public class SumOfAP {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Type in the first term of the series : ");
		int a = number.nextInt() ;
		System.out.print("Type in the common difference of the series : ");
		int d = number.nextInt() ;
		System.out.print("Type in the number of terms in the series : ");
		int n = number.nextInt() ;
		int sum = (n/2)*(2*a+(d)*(n-1));
		System.out.print("Sum = "+sum) ;
	}

}
