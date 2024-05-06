import java.util.*;

public class occurennceRemoveString {
// without idx method use substring to do this 
    // static String remove2(String s){
    //     if(s.length()==0) return " ";
    //     String small=remove2(s.substring(1));
    //     char curr = s.charAt(0);
    //     if(curr=='a'){
    //         return small;

    //     }
    //     else{
    //         return curr+small;

    //     }
    // }

    static String remove(String str,int idx){
        if(str.length()==idx)return "";
        String smallAns = remove(str, idx+1);
        
        
        char curr = str.charAt(idx);



        if(curr!='a'){
            return curr+smallAns;

        }
        else{
            return smallAns;

        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        String str=sc.nextLine();
        System.out.println(remove(str, 0));
        System.out.println(remove3(str,0));


    }

    static String remove3(String str , int idx){
        if(idx==str.length()) return " ";
        char curr = str.charAt(idx);
      String smallans  =  remove3(str, idx+1);
      if(curr=='a'){
        return smallans;

      }
      else{
        return curr+smallans;

      }

    }
}
