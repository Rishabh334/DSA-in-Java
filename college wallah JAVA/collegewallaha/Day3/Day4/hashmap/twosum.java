import java.util.*;

public class twosum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target =9;
        int ans[]=twosum(arr, target);
for (int i = 0; i < ans.length; i++) {
    System.out.print(ans[i]+" ");

}

        
        
    }
    
    static int[] twosum(int arr[],int target){
        int ans[]={-1};

        HashMap  <Integer,Integer> mp= new HashMap<>();
for(int i=0;i<arr.length;i++){
    int partner=target-arr[i] ;
    if(mp.containsKey(partner)){
        ans =new int[]{i,mp.get(partner)};

    }  
    mp.put(arr[i],i);

}
return ans;


    }
}
