import java.util.*;
public class maxones {

    // private static int check(int[] arr){
    //     int n = arr.length;
        
    //     int maxCount = Integer.MIN_VALUE;
    //     for(int i = 0;i<n;i++){
    //         int count = 0;
    //         if(arr[i] == 1){
    //             count++;
    //         }
    //         maxCount = Math.max(maxCount, count);   
    //     }
        
    //     return maxCount;
    // }
    public static void main(String[] args) {
        int arr[]={0,0,0,1,1,1,0,1,0,0,1,1,1,1,1};

        int nums[]=new int [arr.length];
        int count=0;
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                
            }
    else if(arr[i]==0){
                
                nums[x++]=count;
                count=0;
                


            }
            
        }
        if (arr[arr.length - 1] == 1) {
            nums[x] = count;
        }
int max=Integer.MIN_VALUE;
for (int j = 0; j < nums.length; j++) {
    if(nums[j]>max){
       max=nums[j];
   
   }
}
        System.out.print(max);



    }
}
