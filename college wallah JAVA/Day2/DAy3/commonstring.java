import java.util.*;


public class commonstring {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        String str ="eeffbffffaaghbbdidfff";
        String st="dddddbabcdebbfffff";
        String s="";
         String x="";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < st.length(); j++) {
                
                if(str.charAt(i)==st.charAt(j)){
                    s+=str.charAt(i);
    
                }
            }
          
        }
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)!=s.charAt(i+1)){
                x+=s.charAt(i);
            }
            
            
        }
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        String ans = "";

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                ans += arr[i];
            }
        }
        ans += arr[arr.length-1];
    
        System.out.println(s);
        System.err.println(x);
    }
}
