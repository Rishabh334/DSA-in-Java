import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
        selection(arr);
        // System.out.println(Arrays.toString(arr));  
    }
    
    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
//swap function
// SWAP MAX WITH LAST  CORRECT POSITION
}

static int getMaxEle(int arr[],int start,int end){
    int max=start;
    for(int i =0;i<=end;i++){
        if(arr[i]>arr[max]){
            max=i;

        }
    }return max;

}
    
    static void selection(int arr[]){
  
        for(int i=0;i<arr.length-1;i++){
        int     j=arr.length-i-1;
            int maxIndex=getMaxEle(arr,0,j); //find max swap to last idx
             swap(arr, maxIndex ,j);
             System.out.println(Arrays.toString(arr));

        }
    }
}
