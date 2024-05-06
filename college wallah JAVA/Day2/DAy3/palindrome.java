import java.util.*;

public class palindrome {
    public static boolean ispalindrome(String s) {
        // int i = 0;
        // int j=s.length()-1;
        // for ( i = 0; i < s.length(); i++) {
        // if(s.charAt(i)!=s.charAt(j)){
        // return false;

        // }
        // i++;
        // j--;

        // }
        // return true;
        int i = 0;
        int j = s.length();
        for (i = 0; i < s.length(); i++) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;

            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 0;

        // for (int i = 0; i < str.length(); i++) {
        // for (int j = i+1; j < str.length(); j++) {
        // if(ispalindrome(str.substring(i,j))==true){
        // System.out.print(str.substring(i,j)+" ");
        // count++;
        // }
        // }

        // }
        // System.out.println("palindroming count is "+ count);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (ispalindrome(str.substring(i, j)) == true) {
                    System.out.print(str.substring(i, j) + "  ");
                    count++;

                }
            }
        }
        System.out.println(count);

    }
}
