
    import java.util.Scanner;

public class meow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            if (isMeowing(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isMeowing(String s) {
        int idx = 0;
        if (s.charAt(idx) != 'm' && s.charAt(idx) != 'M') {
            return false;
        }
        idx++;
        if (idx >= s.length() || (s.charAt(idx) != 'e' && s.charAt(idx) != 'E')) {
            return false;
        }
        idx++;
        if (idx >= s.length() || (s.charAt(idx) != 'o' && s.charAt(idx) != 'O')) {
            return false;
        }
        idx++;
        if (idx >= s.length() || (s.charAt(idx) != 'w' && s.charAt(idx) != 'W')) {
            return false;
        }
        idx++;
        return idx == s.length();
    }
}
