package Practice;
import java.util.Scanner ;
public class Cubes {

	public static void main(String[] args) {
		Scanner number = new Scanner (System.in);
		System.out.print("Type in the number : ");
		int num = number.nextInt();
		double cube = Math.pow(num,3) ;
		System.out.println("The number = "+num+" and it's cube is : "+cube);

	}

}
