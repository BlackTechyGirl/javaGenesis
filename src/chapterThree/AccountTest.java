package chapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Jane Green", 50.0);
        Account account2 = new Account("John Blue", -7.53);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter withdraw amount for account1: ");
        double withdrawAmount = input.nextDouble();

        System.out.printf("%nadding %.2f to account1 balance%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter withdraw amount for account2: ");
        withdrawAmount = input.nextDouble();

        System.out.printf("%nadding %.2f to account2 balance%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount);

        displayAccount(account1);
        displayAccount(account2);

    }
    public static void displayAccount(Account account) {
        System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());

    }
}
