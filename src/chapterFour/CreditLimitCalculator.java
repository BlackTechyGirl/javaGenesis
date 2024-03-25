package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Account number: ");
        int accountNumber = input.nextInt();


        while (accountNumber != -1){
            System.out.println("Balance at the beginning of the month: ");
            int beginningBalance = input.nextInt();
            System.out.println("Total of all items charged by the customer this month: ");
            int charges = input.nextInt();
            System.out.println("Total of all credits to the customer's account this month: ");
            int credits = input.nextInt();
            System.out.println("Allowed credit limit: ");
            int allowed = input.nextInt();

            double balance = beginningBalance + charges - credits;

            System.out.println("Balance: "+balance);
            if(balance > allowed){
                System.out.println("Credit limit exceeded");
            }else{
                System.out.println("You're good");
            }
            System.out.println("Account number: ");
            accountNumber = input.nextInt();


        }
    }
}
