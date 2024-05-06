import java.util.*;

public class strr {
    // public static void main(String[] args) {
        
    //     Scanner sc = new Scanner (System.in);
    // System.out.println("zeklo".compareTo("afllo"));//just to compare  the first and retrun the number and lexographical order
        
    // System.err.println("rishabh".startsWith("r"));
    // System.err.println("Dikshant".concat(" Sharma"));

    // String  sttr="abcdefghi";
    // // System.out.println(sttr.charAt(0));
    // // for (int i = 0; i < sttr.length(); i++) {
    // //     for (int j = i+1; j <=sttr.length();j++) {
    // //         System.out.println(sttr.substring(i,j )+" ");
            
    // //     }
        
    // // }

    // StringBuilder str=new StringBuilder(sc.nextLine());
    // StringBuilder st=str;
    // str.reverse();
    // if(str.equals(st)){
    //     System.out.println("true");
    
   
    
    

    // }
    static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while (i<=j){
            if(s.charAt(i) =! s.charAt(j)){
                return false;

            }
            else{
                return true;

            }
        }
    
    }
    




}