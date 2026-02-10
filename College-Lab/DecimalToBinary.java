package Practice;
import java.util.Scanner ; 
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Type in the number to be converted : ");
		int num = number.nextInt();
		int binary = 0 ;
		int place = 1 ;
		while(num!=0) {
			int remainder = num%2 ;
			binary = binary + remainder*place ;
			place = place*10 ;
			num=num/2 ;
		}
		System.out.print(binary);

	}

}
