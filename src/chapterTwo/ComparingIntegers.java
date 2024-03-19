package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = input.nextInt();

        int square = number*number;
        if (number > 100 && square > 100) {
            System.out.println("greater than");
        }
        if (number == 100 && square == 100) {
            System.out.println("equal to");
        }
        if (number != 100 && square != 100) {
            System.out.println("not equal to");
        }
        if (number < 100 && square < 100) {
            System.out.println("less than");
        }
    }
}
