
import java.util.*;

public class singleelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 1, 2, 2, 3, 4, 4 };
        int val = 0;
        for (int n : arr) {
            val^=n;
        }

        System.out.println(val);
    }

}
