public class alindrome {
    static boolean palin(String str ,int s ,int l)
    {
        if(s>=l)return true;

       return (str.charAt(s)==str.charAt(l)&& palin(str, s+1, l-1));
    
    
    }

    public static void main(String[] args) {
        String str = "abc a";
        System.out.println(palin(str, 0, str.length()-1));

    }
}
