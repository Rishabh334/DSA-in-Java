// import java.util.*;

// public class binary {
//  public static void main(String[]args){
//     Scanner sc = new Scanner (System.in);

//     int size = sc.nextInt();

//     // int arr[]={1,3,4,5,6,6,6,8,9};
// int target=6;
// int a=binarysearch(arr, target);
// System.out.println(a);
//  } 
//  static int binarysearch(int arr[],int target){
//     int start =0;
//     int end = arr.length-1;
//     while(start<=end){

//         int mid=start+(end-start)/2;

//         if(target>arr[mid]){
//             start=mid+1;

//         }
//         else if(target<arr[mid]){
//             end=mid-1;

//         }
//         else{
//             return mid;
//         }

//     }
//     return -1;

//  }
// }


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int arr[]=new int [n];
        // int n=5;
        // int[] arr={1, 4, 6, 2, 7};
        // int target=4;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int target = sc.nextInt();
        int x = search(arr,target);
        System.out.print (x);
        
    }
    
        public static int search(int arr[],int target){
            
        int start=0;
        int end=arr.length-1;
        int mid=start+end/2;
        while (start<end){
            if(target>arr[mid]){
                start = mid + 1;
            }
            else if(target<arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
            mid=start+end/2;
        } 
        return -1; 
            
        }
}
    
