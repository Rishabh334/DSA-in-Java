import java.util.*;

public class unique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int x = 0;

        System.out.println(unique(arr));

    }

    public static int unique(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                ans = arr[i];

            }
        }
        return ans;

        

    }
}
