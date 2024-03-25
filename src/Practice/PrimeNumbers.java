package Practice;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int numberToCheck = 2; numberToCheck <= 50; numberToCheck++) {
            boolean isPrime = true;
            for (int factor = 2; factor <= numberToCheck ; factor++) {
                if (numberToCheck%factor== 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbers.add(numberToCheck);
            }
        }
        System.out.println("Prime numbers from 1 to 50 are: ");
        for (int number : primeNumbers) {
            System.out.println(number);
        }
    }
}
