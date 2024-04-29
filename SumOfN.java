import java.util.Scanner;

public class SumofN {
    static void func(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

            System.out.print(sum + " ");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        func(n);
        sc.close();
    }
}
