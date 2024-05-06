import java.util.*;

public class prefixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int pref[]=MakePrefixSum(arr);
        PrintArray(pref );

        
    }
    static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int []MakePrefixSum(int arr[]){
        int n = arr.length;
        int pref [] = new int [n];
        int sum = arr[0];

        pref[0]=arr[0];
        for (int i = 1; i < n; i++) {
        //  pref[i]=pref[i-1]+arr[i];
// sum+=arr[i];

// pref[i]=sum;
            arr[i]=arr[i]+arr[i-1];

        }
return arr;

    }


    // For a given array of integers of size n, answer q queries to print the sum of values in a given range of indices from l to r



}
