package Practice;
import java.util.Scanner ;
public class Multiplication {
	public static void main (String [] args) {
		Scanner number = new Scanner (System.in) ;
		System.out.print("Type in the number to be multiplied : ");
		int num = number.nextInt() ;
		for (int i= 1 ; i<=10 ; i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}	
	}
}
