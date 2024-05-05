public class MajorityElements {

    static int majority(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {

                if (arr[j] == arr[i]) {
                    count++;
                }
                if (count > n / 2) {
                    return arr[i];
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 4, 4, 4, 4, 4 };
        int n = arr.length;
        int result = majority(arr, n);
        System.out.println("The majority element in n/2 is :-" + result);
    }
}
