import java.util.ArrayList;

public class Movezerostoend {

    static void move_zero(int[] arr, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        int nz = temp.size();
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        for (int i = nz; i < n; i++) {
            arr[i] = 0;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0, 3, 4, 0, 6, 0, 12 };
        int n = arr.length;
        move_zero(arr, n);

        System.out.println("After the moving all the zeroes to end to the array ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void moves_zero_toend(int arr[], int n) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
            }
        }
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
    }
}


