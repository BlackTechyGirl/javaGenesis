package chapterFour;

import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        int second = 0;

        int counter = 0;
        while (counter < 10){
            System.out.println("Enter 2 numbers: ");
            int num1 = input.nextInt();
            if(num1 > largest){
                second = largest;
                largest = num1;
            } else if (num1 > second && num1 != second) {
                second = num1;
            }
            counter++;
        }


    }
}
