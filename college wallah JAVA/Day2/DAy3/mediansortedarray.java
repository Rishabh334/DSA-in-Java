
import java.util.*;
public class mediansortedarray {
    // merge two sorted array and find median of it

    public static void main(String[] args) {
        int arr[]={1,3,5,7,9};
        int num[]={2,4,6,8};
        int n=arr.length+num.length;

        int newarr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            newarr[i]=arr[i];
            
        }
        int j=0;
        for (int i = arr.length; i < n; i++) {

            newarr[i]=num[j];
            j++;

        }
        System.out.println(Arrays.toString(newarr));

        Arrays.sort(newarr);
        System.out.println(Arrays.toString(newarr));


        // for (int i = 0; i < newarr.length; i++) {
        //     System.out.print(newarr[i]+" ");
        // }
        int start = newarr[0];
        int end=newarr[n-1];
    //  int end=newarr[9];
    System.out.println(start);
     System.out.println(end);
     
// if(n%2==0){

// }
        int mid = (start+end)/2;
        System.out.println(mid);


        // while(start<end){

        
        //     if(n+1%2==0){
        //         mid=(newarr[mid]+newarr[mid-1])/2;
        //         System.out.println(mid);
             
        //     }
        //     else{
        //         System.out.print(mid);
    
        //     }
        //     start++;
        // end--;

        // }

    }

    
}