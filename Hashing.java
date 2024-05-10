import java.util.Scanner;

//Number hashing 
public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] = hash[arr[i]] + 1;

        }
        int q = sc.nextInt();
        while (q-- != 0) {
            int number = sc.nextInt();

            System.out.println(hash[number]);
        }
        sc.close();
    }
}
