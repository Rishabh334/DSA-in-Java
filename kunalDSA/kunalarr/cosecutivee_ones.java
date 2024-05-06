import java.util.*;

public class cosecutivee_ones {
 public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    // int count = 0;
    // int maxCount = 0;
    // for (int i = 0; i < arr.length; i++) {
    //     if(arr[i] == 1){
    //         count++;

    //     }
    //     else{
    //         if(count > maxCount){
    //             maxCount = count;
    //         }
    //         count = 0;
    //     }
    // }
    // if(count>maxCount){
    //     maxCount = count;
    // }
    //     System.out.println(maxCount);
    
    int count=0;
    int max =0;
    for(int i=0 ;i<n;i++){

        if(arr[i]==1){
            count++;
    
        }
        else{
            if(count>max){
                max = count;

            }
            count=0;

        }
    }

    if(count>max) System.out.println(count);
    else {System.out.println(max);}

}
 }   
