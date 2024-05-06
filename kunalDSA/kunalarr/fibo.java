import java.util.*;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        // int c = 1;

        for (int i = 0; i < n ; i++) {
            System.out.println(b);
             b = a + b;
            a = b - a;
            

        }
    }
}
