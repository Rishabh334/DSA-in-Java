import java.util.ArrayList;

import javax.sql.rowset.spi.SyncResolver;

public class subarray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, -7 };

        printsubarray(arr);

    }

    static void printsubarray(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                ArrayList<Integer> list = new ArrayList<>();
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    // System.out.print(+arr[k]+ " ");/

                    // sum+=arr[k];
                    System.out.print(arr[k]);

                }
                // list.add(sum);
                // System.out.println(list);
                System.out.println();

                ts++;
            }
            System.out.println();
        }
        System.out.println(" total subarrays= " + ts);
    }

    static void pair(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                ArrayList<Integer> list = new ArrayList<>();
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];

                }
                list.add(sum);
                if (max < sum) {
                    max = sum;
                }
                System.out.println(list);

            }
            ;
            System.out.println();
        }
        System.out.println(max);

    }
}
