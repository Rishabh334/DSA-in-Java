public class subsetSum {
    static void sumSubset(int arr[],int idx,int n ,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;

        }

        sumSubset(arr,idx+1,n,sum);
         sumSubset (arr,idx+1,n,sum+arr[idx]);

        
    }


    public static void main(String[] args) {
        int arr[]={1,2,3};
        sumSubset(arr, 0,arr.length, 0);
    }
}
