package Practice;
import java.util.Scanner;

public class CharacterClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.nextLine();

        int upper = 0;
        int lower = 0;
        int other = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch))
                lower++;
            else
                other++;
        }
        
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Other: " + other);
    }
}
