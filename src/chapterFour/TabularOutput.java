package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N       N2      N3       N4");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.printf("%-8d%-8d%-8d%-8d", i, i*i, i*i*i, i*i*i*i);
                break;
            }
            System.out.println();
        }
    }
}
