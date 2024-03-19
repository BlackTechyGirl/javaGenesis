package chapterTwo;

import java.util.Scanner;

//This program will calculate the product of three integers
public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int x = input.nextInt();
        System.out.print("Enter second integer: ");
        int y = input.nextInt();
        System.out.print("Enter third integer: ");
        int z = input.nextInt();

        int result = x*y*z;
        System.out.println();

        System.out.printf("Product is %d%n", result);

    }
}
