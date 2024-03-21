package course;

public class Problem9 {
    public static void main(String[] args) {
//       for(int i = 20; i >= 0; i--) {
//           if(i%2 == 1) {
//               System.out.println(i);
//           }

//       }
//        int n=-3;
//        if (n < 10)
//            if (n > 0)
//                System.out.println("The number is positive.");
//            else
//                System.out.println("The number is ______________.");
        int n = 10;
        while (n > 0)
            System.out.println(n);
            n /= 2;

        System.out.println(n * n);
    }
}
