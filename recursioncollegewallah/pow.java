import java.util.*;


public class pow {
    static int sq(int p,int q){
        if(q==0)return 1;
        int ans= sq(p, q-1);
return ans*p;

    }
    public static void main(String[] args) {
        int p=10;
        int q=4;
        System.out.println(sq(p, q));
    }
}
