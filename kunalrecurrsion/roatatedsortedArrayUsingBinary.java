import java.util.*;


public class roatatedsortedArrayUsingBinary {

    static int search(int arr[],int target,int s,int e){
        if(s>e)return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==target) {return mid;}
        if(arr[s]<=arr[mid]){
            if(target>=arr[s]&&target<=arr[mid]){
                return search(arr, target, s , mid-1);


            }
         return search(arr, target, mid+1,e);

        }

else{
        if(target>=arr[e]&&target<=arr[mid]){
            return search(arr, target, mid+1, e);

        }
      else  return search(arr, target, s, mid-1);

    }
    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,1,2,3,4,0};
      int target=6;

      int x=  search(arr,target, 0, arr.length-1);
      System.out.print(x);

    }
}
