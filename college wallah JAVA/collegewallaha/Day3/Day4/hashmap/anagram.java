import java.util.*;


public class anagram {
    public static void main(String[] args) {
        
        String str = "4455";
        String st="abcde";
        isAnagram(str, st);

    }
//     static HashMap<Character,Integer> makeFreqMap(String str){
// HashMap<Character,Integer>mp=new HashMap <> ();
// for(int i=0;i<str.length();i++){
//     Character ch = str.charAt(i);
//     if(!mp.containsKey(ch)){
//         mp.put(ch,1); 

//     }
//     else{
//         int currFreq=mp.get(ch);
//         mp.put(ch,currFreq+1);

//     }
// }
// return mp;

//     }
//     public  boolean isAnagram(String s , String t){
        
//         if(s.length()!=t.length())  return false;

//         HashMap<Character,Integer> map1=makeFreqMap(s);
//         HashMap<Character,Integer> map2=makeFreqMap(t);
//         return map1.equals(map2);

// 
    // }

static HashMap<Character,Integer> makeFreHashMap (String str){
HashMap<Character,Integer> mp=new HashMap<>();
for(int i=0;i<str.length();i++){
    Character ch =str.charAt(i);
    if(!mp.containsKey(ch)){
        mp.put(ch,1);

    }
    else{
        int currFreq=mp.get(ch);
        mp.put(ch,currFreq+1);

    }


}
return mp;


}
static boolean isAnagram(String s ,String t){
    HashMap<Character,Integer> mp1=new HashMap<>();
    HashMap<Character,Integer> mp2=new HashMap<>();
    return mp1.equals(mp2);
}

}
