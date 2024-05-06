import java.util.*;

public class prime {
    public static void main(String[] args) {
        int flag = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(n + " notprime");
        } else {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    System.out.println(n + " not prime");
                }
                flag = 1;
                break;
            }

            if (flag == 0) {
                System.out.println(n + " prime");
            }
        }

    }

}
