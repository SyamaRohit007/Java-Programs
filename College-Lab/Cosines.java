package Practice;
import java.util.Scanner ;
public class Cosines {
	public static void main(String[] args) {
		double sum = 0.0 ;
		Scanner number = new Scanner(System.in);
		System.out.print("Type in the number : ");
		int num = number.nextInt();
		for (int i = 1 ; i<=num;i++) {
			sum+=1.0/i ;
		}
		System.out.println("Sum : "+sum);
	}
}
