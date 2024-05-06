import java.util.*;

public class lenearseach {

    // static boolean search(int arr[], int target, int n, int idx) {
    //     n = arr.length;
    //     if (idx >= n)
    //         return false;
    //     if (arr[idx] == target)
    //         return true;
    //     return search(arr, target, n, idx + 1);

    // }

    static void index(int arr[],int n ,int target,int idx){
         n =arr.length;
if(n<=idx) return;
if( arr[idx]==target) {
    System.out.println(idx);

    }
    index(arr, n, target, idx+1);

    }


    public static void main(String[] args) {

        int arr[] = { 1, 3, 4, 5, 6, 7, 8, 9,9,9,9,9 };
        int n=arr.length;
        int target = 9;
        // if (search(arr, target, arr.length, 0)) {
        //     System.out.print("YES");

        // } else {
        //     System.out.println("NO");
        // }


        index(arr, n, target, 0);
       

    }
}
