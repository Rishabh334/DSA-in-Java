public class palindrome {
    static String palindr(String str , int idx ){

        if(idx==str.length()){
            return "";
        }

        char ans = str.charAt(idx);
        String small= palindr(str,idx+1);
        return small+ans;


    }
  
    public static void main(String[] args) {
        String str ="rishabh";
        String s=palindr(str, 0);
        if(str.equals(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("notpalindrome");
        }
    }
}
