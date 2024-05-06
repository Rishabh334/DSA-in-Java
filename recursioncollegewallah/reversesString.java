import java.util.*;


public class reversesString {
    // static String reverse(String str,int idx ){
    //     if(str.length()==idx) return "" ;
    //     // char ch = str.charAt(0);
    //     String ans =  reverse(str, idx+1);
 
    //    return  ans +  str.charAt(idx);

    // }

    static String reverse(String str , int idx){
        if(str.length()==idx) return "";
        String ans = reverse(str, 0);
        return ans+str.charAt(idx);

    }
    public static void main(String[] args) {
        String str= "Rishabh";

        System.out.println(reverse(str ,0)) ;

    }
}
