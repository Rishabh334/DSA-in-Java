import java.util.*;
public class DAy1 {

     public static void main(String[] args) {
     

        increase(5);

     }

     static void increase (int n ){
        if(n==1){
            System.out.print(1);

            return;

        }
        increase(n-1);
        System.out.print(n);
     }
}
