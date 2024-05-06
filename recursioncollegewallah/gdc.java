import java.util.*;

public class gdc {



    static int gcd(int x,int y){
        if(y==0)return x;
return gcd  (y , x%y);

    }
    public static void main(String[] args) {

// brute force approach

        // int a = 20;
        // int b=10;
        // int ans = 0;

        // for(int i=10 ; i>0 ;i--){
        //     if(b%i==0 && a%i==0){
               
               
        //         ans = i;
        //         break;


        //     }
        // }
        // System.out.println(ans);



        //itertaive;
         

int x= 22;
int y=11;
System.out.println(gcd(x,y));

    }
}
