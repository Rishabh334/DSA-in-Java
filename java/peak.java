import java.util.Scanner;

public class peak  {


    public static int peaky (int arr [], int n){


        if (n==1){
            return 0 ;

        }
        if(arr[0]>=arr[1]){
            return 0;
        }

        if(arr[n-1]>=arr[n-2]){
    
            return n-1;}


        for(int i =0 ;i<n-1;i++){
            if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                return i;
            }
        }
        return 0 ; 

    }

public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int arr [] = new int [n];
    for(int i = 0 ; i<=n-1;i++){
arr[i]= sc.nextInt();
    }


    for(int j = 0 ; j<n-1;j++){
        System.out.println(peaky(arr,n));
        
}





    
}
}







