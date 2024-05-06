import java.util.*;

public class sqsorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        int ans [] = squarearr(arr);
        reversearr(ans,0, arr.length - 1);
        printarr(ans);
    }

    static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");


        }

    }

    static void reversearr(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

    }

    static int[] squarearr(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int k = 0;
        int ans[] = new int[arr.length];

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;

            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
}
