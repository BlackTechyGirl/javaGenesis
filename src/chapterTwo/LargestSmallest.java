package chapterTwo;

import java.util.Scanner;

public class LargestSmallest {
    public static void prompt(){
        System.out.println("Enter a number: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        prompt();
        int num1 = input.nextInt();
        prompt();
        int num2 = input.nextInt();
        prompt();
        int num3 = input.nextInt();
        prompt();
        int num4 = input.nextInt();
        prompt();
        int num5 = input.nextInt();

        System.out.println("Largest: "+ Math.max(num1, (Math.max(num2, Math.max(num3, Math.max(num4, num5))))));
        System.out.println("Smallest: "+ Math.min(num1, (Math.min(num2, Math.min(num3, Math.min(num4, num5))))));

    }
}
