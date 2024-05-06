import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class base{
    public static void main(String[] args) {
        bothpri(5);
    }
    
    // static void print(int n ){
        //     if(n==10){
            //         System.out.println(n);
            //         return;
            
            //     }
            
            //     System.out.println(n);
            //     print(n+1);
            
            // }
static void pri(int n ){
    if(n==0)return;
    pri(n-1);
    System.out.println(n); // forward printing;



}

    static void revpri(int n ){
        if(n==0)return;
        System.out.println(n); // reverse printing;
        revpri(n-1);
        
    
    
    }
    static void bothpri(int n ){
        if(n==0)return;
        
        System.out.println(n); // reverse forward  printing;
        bothpri(n-1);
        System.out.println(n);
    
    
    }
}