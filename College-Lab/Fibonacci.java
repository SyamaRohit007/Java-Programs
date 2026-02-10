package Practice;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
        System.out.println("Enter the number of elements in series : ");
        int n = number.nextInt();
        int firstnum = 0;
        int secondnum = 1;
        int count = 0 ;
        for(int i=1;i<=n;i++) {
        	System.out.print(firstnum+" ");
        	int next = firstnum+secondnum;
        	firstnum = secondnum;
            secondnum = next;
        }
        

	}

}
