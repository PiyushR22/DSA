import java.util.*;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int n1 = n;

        while (n1 > 0) {
            int rem = n1 / 10;
            if (rem % 2 == 0) {
                even = even + rem;
            } else {
                odd = odd + rem;

            }

            n1 = n1 / 10;

        }

        System.out.println(even + " " + odd);

        sc.close();
    }

}
