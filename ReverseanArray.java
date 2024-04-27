public class reverseanarray {

    static void printArray(int ans[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    // Function to reverse array using an auxiliary array
    static void fun(int arr[], int n) {
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[n - i - 1] = arr[i];
        }
        printArray(ans, n);
    }

    public static void main(String[] args) {

        int n = 10;
        int arr[] = { 5, 4, 6, 7, 8, 34, 54, 65, 78, 22 };
        fun(arr, n);

    }
}
