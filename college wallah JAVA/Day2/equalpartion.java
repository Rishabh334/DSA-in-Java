import java.util.*;
public class equalpartion{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(ArrayEqualPartion(arr));
    }

static int ArraySum(int arr[]){
    int sum=0;

    for(int i=0 ;i<arr.length;i++){
        sum=sum+arr[i];

    }
    return sum;

}




    static boolean ArrayEqualPartion(int arr[]){
        int totalSum=ArraySum(arr);

        int n =arr.length;
    
    int prefsum=0;


        for(int i =1 ;i<n;i++){
            prefsum+=arr[i];
            int suffixsum=totalSum-prefsum;
            if(suffixsum==prefsum){
                return true;

            }

        }
return false;


        
    }
  


}