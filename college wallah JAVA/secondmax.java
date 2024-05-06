import java.util.*;

public class secondmax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int x = 0;

        System.out.println(findsecondmax(arr));

    }

    public static int findMax(int arr[]) { // isme max kiya find 
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;

    }

    public static int findsecondmax(int[] arr) { // we replace all max with -infinty; and then find again max
        int mx = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;

            }
        }
        int sec = findMax(arr);

        return sec;

    }


    
}
