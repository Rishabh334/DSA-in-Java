
import java.util.*;

public class reverse {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int n = sc.nextInt();

    // int arr[] = new int[n];
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = sc.nextInt();

    // }
    // for (int i = n; i >= 0; i--) {
    // System.out.print(arr[i]);
    // }

    // }

    // reverse using swwap

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        reverseArray(arr);
        printarray(arr);

    }

    static void swaparr(int arr[], int i, int j) {
        int temp = 0;
        arr[i] = temp;
        arr[i] = arr[j];
        arr[i] = temp;

    }

    static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {

            swaparr(arr, i, j);
            i++;
            j++;

        }

    }

    static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
