package chapterTwo;

import java.util.Scanner;

public class Values {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        prompt();
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        if (num1 < 0){
            negatives++;
        }
        if (num1 > 0){
            positives++;
        }
        if (num1 == 0){
            zeros++;
        }

        if (num2 < 0){
            negatives++;
        }
        if (num2 > 0){
            positives++;
        }
        if (num3 == 0){
            zeros++;
        }

        if (num3 < 0){
            negatives++;
        }
        if (num3 > 0){
            positives++;
        }
        if (num3 == 0){
            zeros++;
        }

        if (num4 < 0){
            negatives++;
        }
        if (num4 > 0){
            positives++;
        }
        if (num4 == 0){
            zeros++;
        }

        if (num5 < 0){
            negatives++;
        }
        if (num5 > 0){
            positives++;
        }
        if (num5 == 0){
            zeros++;
        }

        System.out.println("positives: " + positives);
        System.out.println("negatives: " + negatives);
        System.out.println("zeros: " + zeros);

    }
    public static void prompt(){
        System.out.println("numbers: ");
    }
}
