package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Item number:  ");
        int item = input.nextInt();

        double total = 0;
        double earnings=0;

        while (item != -1) {
            System.out.println("Value: ");
            double value = input.nextDouble();

            total+=value;
            earnings = 2000 + (0.09 *total);

            System.out.println("Item number:  ");
             item = input.nextInt();

        }
        System.out.println("Total: "+earnings);


    }
}
