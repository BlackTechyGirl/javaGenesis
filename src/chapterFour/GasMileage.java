package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter mile driven or -1 to stop: ");
        int miles = input.nextInt();

        System.out.println("Enter gallons used: ");
        int gallons = input.nextInt();

        double total = 0;

        while (miles != -1){
            double milesPerGallon = (double) miles/gallons;
            System.out.println("Miles per gallon: "+milesPerGallon);
            total += milesPerGallon;

            System.out.println("Total: "+total);

            System.out.println("Enter mile driven or -1 to stop: ");
            miles = input.nextInt();

            System.out.println("Enter gallons used: ");
            gallons = input.nextInt();


        }
    }
}
