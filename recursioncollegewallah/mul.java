import java.util.*;


public class mul {
    static void mulprint(int n ,int  k ){
         if(k==0) return;
        mulprint(n, k-1);
    System.out.println(n*k);
       
    }
    public static void main(String[] args) {
    mulprint(6, 6);


    }
}
