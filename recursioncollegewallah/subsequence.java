import java.util.*;


public class subsequence {

    // static void subset(String str,String curr){
    //     if(str.length()==0){
    //         System.out.println(curr);
    //         return ;

    //     }
    //     char currchar=str.charAt(0);
    //     String remString=str.substring(1);
        
    //     subset(remString, curr+currchar);
    //     subset(remString, curr);
    // }
// static void subset(String str,String currAns){
//     if(str.length()==0){
//         System.out.println(currAns);
//         return;

//     }

//     char curr =str.charAt(0);
//     String remString=str.substring(1);
    
//     subset(remString, currAns+curr);
    
//     subset(remString, currAns);


// }


static void subset(String str,String currAns){
    if(str.length()==0) {System.out.println(currAns); return;}

    char curr= str.charAt(0);
    String remString=str.substring(1);
    subset(remString, currAns+curr);;
    subset(remString,currAns);

}
    public static void main(String[] args) {
        String str="abc";
                subset(str," " );
    }
}
