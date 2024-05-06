import java.util.*;

public class lec {
    
    public static int Sum(int[] arr, int target) {
        int ans = 0;
        int n =  arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] + arr[j] == target) {
                    
                    
                    ans++;

                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("enter target sum");

        int target = sc.nextInt();
        System.out.println(Sum(arr, target));

    }

}