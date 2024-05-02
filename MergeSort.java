import java.util.*;

public class Mergesort {
    private static void merge(int arr[], int low, int high, int mid) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;

            } else {
                temp.add(arr[right]);
                right++;

            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;

        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;

        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergesort(int arr[], int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergesort(arr, low, mid);// left half
        mergesort(arr, mid + 1, high);// right half
        merge(arr, low, high, mid);// merging sorted halfs
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 32, 12, 3, 12, 6, 8, 23 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Mergesort.mergesort(arr, 0, n - 1);
        System.out.println("After sorting array:  ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }

}
