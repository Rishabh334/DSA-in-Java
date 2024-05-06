import java.util.*;


public class bubblesort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }    
    static void bubblesort(int arr[]){
        int n = arr.length;
// bubble sort brute force hai ye 
        for (int  i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
}
