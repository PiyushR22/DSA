public class MaximumSubArray {

    static int maximum_sub_array(int arr[], int n) {
        int sum = 0;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum > max) {
                max = sum;

            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        int result = maximum_sub_array(arr, n);
        System.out.println("The Maximum Subarray " + result);

    }
}
