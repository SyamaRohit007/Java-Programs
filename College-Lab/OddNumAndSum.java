package Practice;
import java.util.Scanner ;
public class OddNumAndSum {

	public static void main(String[] args) {
		int sum = 0 ;
		Scanner number = new Scanner(System.in) ;
		System.out.print("Type in the number : ");
		int num = number.nextInt() ;
		for (int i = 1 ; i<=(2*(num)-1); i+=2) {
			System.out.print(i+" , ");
			sum+=i ;
		}
		System.out.print("The sum = "+sum);
	}

}
