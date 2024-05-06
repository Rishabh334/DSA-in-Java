
import java.util.*;

public class sumofarray {
// static int sumofarr(int arr[],int idx){
//     if(idx==arr.length-1)return arr[idx];
//     // int small = sumofarr(arr, idx+1);   //taking in variable
//     // return (small+arr[idx]);   // variable
//     return sumofarr(arr , idx+1) + (arr[idx]);



// }

static int sumofarr(int arr[],int idx){
    if(idx==arr.length-1) return arr[idx];
    int small=sumofarr(arr, idx+1);
    return small+arr[idx];

}
    public static void main(String[] args) {
    int arr[]={0,1,2,3,4,5,8};
System.out.println(sumofarr(arr, 0));
   } 
}
