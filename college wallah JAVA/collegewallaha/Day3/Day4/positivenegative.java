import java.util.*;
public class positivenegative {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int[]b=new int [a.length*2];
        for (int i = 0; i < b.length; i++) {
            b[i]=a[i];
        }
        int z=0;

       for (int i = a.length-1; i < b.length; i++) {
           if(a[i]<=-1){
               b[i]=a[i];
               z++;
               

           }
       }
       return a;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, -4, -5};
        alternateNumbers(arr);
        Arrays.toString(arr);

    }

}
