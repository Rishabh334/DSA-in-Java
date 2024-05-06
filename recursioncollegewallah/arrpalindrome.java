import java.util.*;


public class arrpalindrome {
    static boolean palindrome(String str,int s,int l){
        if(s>=l) return true;
        return (str.charAt(s)==str.charAt(l)&&   palindrome(str, s+1, l-1));

        
        

    }



public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    int n =sc.nextInt();
    String str =Integer.toString(n);
    System.out.println(palindrome(str, 0, str.length()-1));

}
}
