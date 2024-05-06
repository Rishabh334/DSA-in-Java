import java.util.Arrays;
import java.util.Scanner;

public class String4 {

    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        
        String str = sc.nextLine();

        String st2 = sc.nextLine();

        if(str.length()!=st2.length()){
            System.out.println("valid Anangram");
        }
else{

    str.toLowerCase();
    st2.toUpperCase();
    
     str.trim();
    
     st2.trim();

     char[] array1= str.toCharArray();
     char[] array2=st2.toCharArray();
      Arrays.sort(array1);
      Arrays.sort(array2);

      if(Arrays.equals(array1,array2)){
        System.out.println("Invalid Anagrama");
      }

     
}
    }
    
}
