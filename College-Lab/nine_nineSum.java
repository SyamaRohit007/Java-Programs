package Practice;
import java.util.Scanner ; 
public class nine_nineSum {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Type in the number of nines whose sum is to be calculated : ");
		double num = number.nextInt() ;
		double answer = (((Math.pow(10, num))-1)*(10.0/9)) - ( num );
		System.out.println("The sum is as follows : "+answer);
	}

}
