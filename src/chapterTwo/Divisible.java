package chapterTwo;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("number: ");
        int number = input.nextInt();

        if (number%3 == 0) {
            System.out.println("divisible by 3");
        }
    }
}
