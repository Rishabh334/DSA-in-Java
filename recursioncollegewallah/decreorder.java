import java.util.*;


public class decreorder {
    public static void main(String[] args) {
       decrease (5);




    }


    static void decrease(int n ){
        if(n==0){
            return ;


        }
        System.out.print(n);
        decrease(n-1);

    }
}
