import java.util.Scanner;

public class ntoone {

    static void func(int i, int n) {
        if (i < 1)
            return;
        System.out.print(i + " ");
        func(i - 1, n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        System.out.println();
        func(n, n);

        sc.close();

    }
}
