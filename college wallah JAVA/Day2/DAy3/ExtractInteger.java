public class ExtractInteger {
   
    static void extractIntegers(char []str)
{
    int n = str.length;
 
    // This variable will store each founded
    // integer temporarily
    String tillNow = "";
 
    for (int i = 0; i < n; i++) {
 
        // If current character is an integer, then
        // add it to String tillNow
        if (str[i] - '0' >= 0 && str[i] - '0' <= 9) {
            tillNow += str[i];
        }
 
        // Otherwise, check if tillNow is empty or not
        // If it isn't then convert tillNow to integer
        // and empty it after printing
        else {
            if (tillNow.length() > 0) {
                System.out.print(Integer.parseInt(tillNow) +" ");
 
                tillNow = "";
            }
        }
    }
 
    // if tillNow isn't empty then convert tillNow
    // to integer and print it
    if (tillNow.length() > 0) {
        System.out.print(Integer.parseInt(tillNow) +" ");
    }
}
 
// Driver Code
public static void main(String[] args){


{
    String str = "Hey everyone, "  +"I have 500 rupees and" +" I would spend a 100";
    extractIntegers(str.toCharArray());
}
}}
 
