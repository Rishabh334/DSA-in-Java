
import java.util.*;

// public class remove_spacefrom_String {
//     public static void main(String[] args) {
//         String str = " Mandi is Pragun";
//                 str = str.replaceAll("//s","");
//         System.out.println(str);
//     }}



// public class remove_spacefrom_String{
//     public static void main(String[]args){
//         String str="j,a*v&A@";
//         String st=str.replaceAll("[^a-zA-z0-9]","");
//         System.out.println(st);
//     }
// }

public class remove_spacefrom_String{


public static void main(String[]args){
    String str="ShreeGanesh";
    StringBuilder st=new StringBuilder() ;
    for(int i=0 ;i<str.length();i++){
        char ch= str.charAt(i);
        int idx =str.indexOf(ch,i+1);
        if(idx ==-1){
            st.append(ch);

        }
        
        
    }
    System.out.println(st);
}
}
