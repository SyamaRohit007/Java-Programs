package Practice;
import java.util.Scanner ;
public class Practicecenterasterisk {
	public static void main(String[]args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Type the number of rows : ");
		int num = number.nextInt();
		for (int i = 1 ; i<=num ; i++) {
			for(int s=1;s<=num-i;s++) {
				System.out.print(" ");	
			}
			for(int s=1;s<=i;s++) {
				System.out.print("*"+" ");	
			}
			System.out.println();
		}
		for (int i = num-1 ; i>=0 ; i--) {
			for(int s=1;s<=num-i;s++) {
				System.out.print(" ");	
			}
			for(int s=1;s<=i;s++) {
				System.out.print("*"+" ");	
			}
			System.out.println();
		}
	}
}
