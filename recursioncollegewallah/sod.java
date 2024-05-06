import java.util.*;

public class sod {
    static int sod(int n ){
        if(n>=0&&n<=9){
            return n;

        }
        // int ans = (n/10);
        //return sod(ans+n%10);
        return sod((n/10)+n%10);



    }
    public static void main(String[] args) {


        System.out.println(sod(12345));
        
    }
}
