
import java.util.*;
import java.util.Arrays;


public class minmax {


    public static int getMin(int arr[], int n){
        
        return Arrays.stream(arr).min().getAsInt();
   
    }

    public static int getMax(int arr[],int n){
        return Arrays.stream(arr).max().getAsInt();


    }

    public static void main(String []args){
        Scanner sc = new Scanner (System.in);

        int size  = sc.nextInt();


    int []arr=new int[size];


    for(int i =0 ;i <size -1;i++){
        arr[i]=sc.nextInt();

    }

    
        
        System.out.println("The maximum element is "+getMax(arr,size));
       System.out.print("The minimum element is "+getMin(arr,size));


    }
    
}
