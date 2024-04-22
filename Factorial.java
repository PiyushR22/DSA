//import java.util.*;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  no.-");
        Double n = sc.nextDouble();

        int factorial = 1;

        while (n > 0) {
            factorial *= n;
            n--;

        }
        System.out.println("factorial is :-" + factorial);
        sc.close();
    }
}
