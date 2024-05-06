import java.util.*;

public class maxUsingRecursion {

    static int maxxx(int [] arr,int idx){
        if(idx == arr.length-1) return arr[idx];
        int small = maxxx(arr, idx+1);
        return Math.max(arr[idx],small);

    }
    static void printarr(int arr[],int idx){
        if(idx==arr.length){
              return ;
        } 
        System.out.println(arr[idx]);
        printarr(arr, idx+1);
    }
public static void main(String[] args) {
    int arr[]={6,5,5,4,66,32,22,88,6};
   System.out.println(maxxx(arr,0));
    

}
}
