import java.util.*;

public class aliceandbob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        int arr_r[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int j = 0; j < arr_r.length; j++) {
            arr_r[j] = sc.nextInt();

        }
        // int i = 0;
        int count = 0;
        // while(i<arr.length){
        //     if(arr[i]==arr_r[i]){
        //         count++;
        //     }
        //     i++;
        // }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr_r[i]) {
                count++;
        }
        
    }
    System.out.println(count);
    }

}
