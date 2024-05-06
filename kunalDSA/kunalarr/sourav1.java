
import java.util.Arrays;

public class sourav1 {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5 };
        int arr1[] = { 1, 3, 7, 8 };
        // int a =arr.length;
        // int b=arr1.length;
        // int c =arr.length+arr1.length;

        // int newarr []= new int [c];

        // int newarr[]=new int [arr.length + arr1.length];
        System.out.println(Arrays.toString(NewArray(arr, arr1)));

    }

    static int[] NewArray(int arr[], int arr1[]) {

        int a = 0;
        int b = 0;
        int c = arr.length + arr1.length;

        int newarr[] = new int[c];

        int i = 0;
        // while (a < arr.length && b < arr1.length) {
        //     if (arr1[b] < arr[a]) {
        //         newarr[i] = arr1[b];
        //         b++;
        //     }

        //     else {
        //         newarr[i] = arr[a];
        //         a++;

        //     }
        //     i++;

        // }
        for(;a < arr.length && b < arr1.length;){
                if (arr1[b] < arr[a]) {
                newarr[i] = arr1[b];
                b++;
            }

            else {
                newarr[i] = arr[a];
                a++;

            }
            i++;
        }


        while(a != arr.length){
            newarr[i] = arr[a];
            i++;
            a++;
        }

         while(b != arr1.length){
            newarr[i] = arr1[b];
            i++;
            b++;
        }

        return newarr;

    }

}
