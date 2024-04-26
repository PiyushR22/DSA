
public class SortedArray {

    static boolean sorted_array(int n, int arr[]) {

        for (int i = 1; i < n; i++) {

            if (arr[i] >= arr[i - 1]) {

            } else
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 5 };
        int n = arr.length;
        boolean is_sorted = sorted_array(n, arr);

        if (is_sorted) {
            System.out.println("The array is sorted ");
        } else {
            System.out.println("The array is not sorted ");
        }
    }
}
