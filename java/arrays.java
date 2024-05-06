import java.util.*;

public class arrays {
    public static void main(String[]args){


        int arr[]=new int [5];
        /*  arr[0] = 5;
          arr[1] = 5;
          arr[2] = 5;
          arr[3] = 5;
          arr[4] = 5;
      */

        Scanner sc=new Scanner(System.in);

        System.out.println(arr[2]);
        int n=5;

        for(int i =0 ;i<n ;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]);
        }
    }
}

