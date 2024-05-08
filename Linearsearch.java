import java.util.Scanner;

public class Linearsearch {

    static int linear_search(int arr[], int s, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == s) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 6, 8, 1, 67 };
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. ");
        int s = sc.nextInt();

        sc.close();
        int result = linear_search(arr, s, n);
        if (result != -1) {
            System.out.println("No. found at index " + result);

        } else {
            System.out.println("No. not found in the given array  ");
        }
    }
}
