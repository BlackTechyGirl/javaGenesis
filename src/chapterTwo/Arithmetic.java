package chapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        display();
        int num1 = input.nextInt();
        display();
        int num2 = input.nextInt();

        System.out.printf("Square of number 1: %d%n", square(num1));
        System.out.printf("Square of number 2: %d%n", square(num2));
        System.out.printf("Square of number 1: %d%n", square(num1));
        System.out.printf(" Sum of Squares: %d%n", square(num1)+square(num2));
        System.out.printf("Difference of Squares: %d%n", square(num1)-square(num2));





    }
    public static void display(){
        System.out.println("Enter a number: ");
    }
    public static int square(int num) {
        return num*num;
    }

}
