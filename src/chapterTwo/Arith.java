package chapterTwo;

import java.util.Scanner;

public class Arith {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        display();
        int num1 = input.nextInt();
        display();
        int num2 = input.nextInt();
        display();
        int num3 = input.nextInt();
        System.out.println("Sum: " + (num1 + num2 + num3));
        System.out.println("Average: " + (num1 + num2 + num3)/2);
        System.out.println("Product: " + num1 * num2 * num3);
        System.out.println("Smallest:" + Math.min(num1, Math.min(num2, num3)));
        System.out.println("Largest:" + Math.max(num3, Math.min(num1, num2)));
        System.out.printf("%s%n%s%n%s%n%s%n", " *", " ***", "*****", " ***", " *");





    }
    public static void display(){
        System.out.println("Enter a number: ");
    }
}
