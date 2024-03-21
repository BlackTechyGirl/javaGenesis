package chapterTwo;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five digits number: ");
        int digit = input.nextInt();

        int digit1 = digit/10000;
        int digit2 = (digit%10000)/1000;
        int digit3 = ((digit%10000)%1000)/100;
        int digit4 = (((digit%10000)%1000)%100)/10;
        int digit5 = (((digit%10000)%1000)%100)%10;

        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
    }
}
