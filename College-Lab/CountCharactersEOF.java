package Practice;
import java.util.Scanner;

public class CountCharactersEOF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (input.hasNext()) {
            String str = input.next();
            count += str.length();
        }
        System.out.println("Total characters: " + count);

    }
}
