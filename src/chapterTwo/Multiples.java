package chapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("num 1: ");
        int num = input.nextInt();

        System.out.println("num 1:");
        int num1 = input.nextInt();

        int tripled = num*num*num;
        int doc = num1*num1;

        if (tripled%doc == 0) {
            System.out.println("multiples");
        }

    }
}
