package Practice;

public class Expo {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        double sum = 1;
        double term = 1;

        for (int i = 1; i <= n; i++) {
            term = term * x / i;
            sum += term;
        }

        System.out.println("Sum: " + sum);
    }
}

