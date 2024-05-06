import java.util.*;

public class alternatenumber {
    public static void main(String[] args) {
        int a[] = { 1, 2, -3, -1, -2, 3 };
        int b[] = new int[a.length];
        int c[] = new int[a.length];
        int newarr[] = new int[a.length];

        for (int i = 0; i <= a.length / 2; i++) {
            if ((a[i]) > -1) {
                b[i] = a[i];

            }

        }
        System.out.println(Arrays.toString(b));
        int j = 0;

        for (int i = 0; i < c.length; i++) {
            if (a[i] <= -1) {
                c[j] = a[i];
                j++;

            }
        }
        System.out.println(Arrays.toString(c));
        int x = 0;

        for (int i = 0; i < c.length; i = i + 2) {

            newarr[i] = b[x];
            newarr[i + 1] = c[x];
            x++;

        }
        System.out.println(Arrays.toString(newarr));

    }
}
