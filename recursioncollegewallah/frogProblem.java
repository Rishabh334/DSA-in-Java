import java.util.*;
public class frogProblem{

   public  static int best(int arr[],int n,int idx){
        if(idx == n-1)return 0;
 
        int op1=best(arr,n,idx+1)+ Math.abs(arr[idx+1]-arr[idx]);
        System.out.print(op1 +" ");

        if(idx==n-2 )return op1;

        int op2=best(arr,n,idx+2)+ Math.abs(arr[idx+2]-arr[idx]);
        System.out.println(op2+" ");
        return Math.min(op1, op2);
        

    }
    public static void main(String []args){
        int arr[]={10,30,40,20};
        int n =arr.length;

        System.out.println(best(arr, n, 0));
    }
}