import java.util.*;

public class LastTargetIndex {

    static int last(int arr[], int target, int idx) {

        if (idx == 0) {
            return idx;

        }
        if (arr[idx] == target) {
            return idx;

        }
        return last(arr, target, idx - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5 };
        System.out.println(last(arr, 1, arr.length - 1));
    }
}
