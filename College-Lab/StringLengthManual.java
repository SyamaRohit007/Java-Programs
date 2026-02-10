package Practice;
import java.util.Scanner;
public class StringLengthManual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.nextLine();
        char[] arr = str.toCharArray();
        int count = 0;
        for (char c : arr) {
            count++;
        }
        System.out.println("Length is: " + count);

    }
}
