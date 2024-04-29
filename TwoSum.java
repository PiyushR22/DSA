public class TwoSum {

    static String two_sum(int arr[], int n) {
        int target = 14;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (arr[i] + arr[j] == target)
                    return "YES";

            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 11 };
        int n = arr.length;
        String result = two_sum(arr, n);
        System.out.println(result);
    }
}
