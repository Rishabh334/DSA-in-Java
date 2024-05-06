
import java.util.ArrayList;

public class leetcodebinary477 {
    public static void main(String[]args){
String ch =["c","e","g","h"];
        char target='v';

char x = nextGreatestLetter(char[]letter,target);

        System.out.println(x);
    }

     public   char nextGreatestLetter(char[] letter, char target) {
        
    
            int start = 0;
            int end = letter.length - 1;
           
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < letter[mid]) {
                    end = mid - 1;
    
                } else if (target >letter[mid]) {
                    start = mid + 1;
    
                }
                 
            }
            return letter[start%letter.length];
    
        }
    }
    

