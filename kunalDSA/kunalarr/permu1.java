import java.util.*;

public class permu1 {
    public static void main(String[] args) {
        

       Scanner sc =new Scanner (System.in);
       int arr[]=new ;

       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();

       }
        if (arr.length == 4) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    for (int k = 0; k < arr.length; k++) {
                        for (int l = 0; l < arr.length; l++) {
                            if (i != j && j != k && k != i && l != i && l != j && l != k) {

                                System.out.println(arr[i] +" "+ arr[j] +" "+ arr[k] +" "+ arr[l]);
                            }
                        }

                    }
                }
            }
        }
    }
}