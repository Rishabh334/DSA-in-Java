import java.util.*;


public class CaseString {
   public static void main(String[] args) {
    String str="Rishabh";
    String st="";

    for(int i =0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch>='a'&&ch<='z'){
            st+=(char) (ch-32);

        }
        else st+=(char) (ch+32);

    }

    System.out.println(st);
   } 
}
