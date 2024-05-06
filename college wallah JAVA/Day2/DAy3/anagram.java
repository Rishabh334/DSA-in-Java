import java.util.Arrays;

public class anagram {

    public boolean isAnagram(String s, String t) {
        char arr[]=new char[s.length()];
        char brr[]=new char[t.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i]=s.charAt(i);
        }
        for(int j=0;j<t.length();j++)
        {
            brr[j]=t.charAt(j);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        if(Arrays.equals(arr,brr))
        {
            return true;
        }
        return false;
    }
}
