import java.util.*;

public class ocurrence {
    public static void main(String[] args) {
        int arr[] = {1,1,3,4,4,5,6};
       
        int sum = 0;
        
       Arrays.sort(arr);
       for(int  i=1;i<arr.length;i++){
int count=0;

        if(arr[i-1]==arr[i]){
            count++;
        }

        if(count%2!=0){
            sum=+arr[i];

        }
       }
       System.out.print(sum);


    }
}
