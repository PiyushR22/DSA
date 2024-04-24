public class Findduplicates {

    static int find_duplicates(int n, int arr[]) {
        int i = 0;
        {
            for (int j = 1; j < n; j++) {
                if (arr[j] != arr[i]) {
                    i++;
                    arr[i] = arr[j];

                }
            }
            return i + 1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 3, };
        int n = arr.length;
        int k = find_duplicates(n, arr);
        System.out.println("The array after removing duplicate element is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
