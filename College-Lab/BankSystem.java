
package Practice ;
import java.util.Scanner;

public class BankSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount defaultAccount = new BankAccount();

        System.out.println("Default Account Details:");
        defaultAccount.displayAccountDetails();

        System.out.println();

        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();

        System.out.print("Enter account holder name: ");
        String accHolder = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount userAccount = new BankAccount(accNumber, accHolder, initialBalance);

        System.out.println();
        System.out.println("Performing transactions...");

        userAccount.deposit(500);

        System.out.println();

        userAccount.withdraw(2000);

        System.out.println();

        System.out.println("Final Account Details:");
        userAccount.displayAccountDetails();

        scanner.close();
    }
}
