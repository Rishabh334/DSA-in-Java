import java.util.*;
//SMALLEST NUMBER GREATER THEN EQUAL TO TARGET
public class celinbinary {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 7, 8, 12, 13, 134, 544 };
        Scanner sc = new Scanner(System.in);
        int target=90;
     //   int target = sc.nextInt();
        int x = celinbinary(arr, target);
        System.out.println(x);

    }

    static int celinbinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target>arr[arr.length-1])
        {
            return -1; 
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target >arr[mid]) {
                start = mid + 1;

            }
             else {
                return mid;

            }
        }
        return start;

    }
}