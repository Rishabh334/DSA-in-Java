import java.util.*;

public class checkSorting {
    static boolean sorted(int arr[], int n, int idx) {

        // ArrayList <Integer> list =new ArrayList<>();

        n = arr.length - 1;

        if (idx >= n) {
            return true;

        }

        if (arr[idx] >= arr[idx + 1]) {

            return false;

        }

        return sorted(arr, n, idx + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 7 };
        int n = arr.length - 1;

        System.out.print(sorted(arr, n, 0));

    }

}
