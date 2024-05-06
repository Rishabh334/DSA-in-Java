import java.util.Arrays;
import java.util.*;

public class bubble_and_selection_sort {
    public static void main(String[] args) {

Scanner sc =new Scanner (System.in);
        int arr[] = {};
        // bubblesort(arr);
        bubblesort(arr);
         for (int x = 0; x < arr.length; x++) {

            arr[x]=sc.nextInt();

        } 


    }
 /*BUBBLE SORT */


    static void bubblesort(int arr[]) {       
         int swap =0;
        for (int i = 0; i < arr.length; i++) {
           

            for (int j =i; j < arr.length - 1 -i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;


                }
            }
        }
        if(swap==0){
            System.out.println("yes");
        }
        else{
            System.out.println("not sorted");
        }
        // System.out.println(swap);//zero swap is there in case of sorted arr
//                for(int z=0 ;z<arr.length;z++){
//  System.out.println(arr[z]);

            // }
           
    }



    static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos] >  arr[j]){
                    minpos = j;

                }
            }
            //Swap
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;


        }


    System.out.print(Arrays.toString(arr));
    }
}
