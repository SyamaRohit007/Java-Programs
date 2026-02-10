package Practice;
import java.util.Scanner ;
public class SumEvenNum {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Type in the number : ");
		int num = number.nextInt() ;
		int sum = 0;
		for(int i =0;i<=num;i++) {
			sum+=i;
		}
		System.out.print("The sum of the first "+num+" even numbers is : "+sum*2);

	}

}
