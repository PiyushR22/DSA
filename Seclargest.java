static void seclargest_ele(int arr[], int n) {
        int largest = arr[0];
        int Slargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                Slargest = largest;
                largest = arr[i];
            }
        }
        System.out.println("Second largest element in array is :- " + Slargest);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 9 };
        int n = arr.length;
        seclargest_ele(arr, n);
    }
}
