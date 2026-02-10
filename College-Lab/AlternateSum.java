package Practice;

public class AlternateSum {

	public static void main(String[] args) {
		int num = 5 ;
		int x = 2 ;
		int sign = 1 ;
		int sum = 0 ;
		int power = 1 ;
		for (int i =1;i<=num ; i++) {
			sum+=sign*Math.pow(x, power);
			sign*=-1;
			power+=2 ;
		}
		System.out.println("Sum = "+sum);

	}

}
