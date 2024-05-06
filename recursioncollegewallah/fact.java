import java.util.*;


public class fact {

    private static int  fact (int n ){
        if(n==0) return 1;

        return n*fact(n-1); // this return statement only work when we whole method of fact is run 

        }
 public static void main(String[] args) {
    System.out.print(fact(5));

 }   
}
