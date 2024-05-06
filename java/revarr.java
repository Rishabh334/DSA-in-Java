import java.util.*;

public class revarr {

    public static void main(String []args){
  /*      Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int []arr= new int [n];
        for(int j=0; j<=n ;j++){
            arr[j]=sc.nextInt();
        }
        for(int i=n ;i>=0;i--){
            System.out.println(arr[i]);
        }
        
        */

        Scanner sc =new Scanner (System.in);


        int n =sc.nextInt();

        int rev=0;
        while (n>0){
            rev*=10;
            rev+=n%10;
            n/=10;

        }
        System.out.println(rev);


    }





}