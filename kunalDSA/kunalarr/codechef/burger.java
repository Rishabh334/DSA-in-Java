
import java.util.*;

public class burger {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner (System.in);
        int t =sc.nextInt();
        while(t>0){
            
        int a =sc.nextInt();
        int b =sc.nextInt();
    
        if(a>=b){
            System.out.print(b);
            
        }
        else{
            System.out.print(a);
    }
    t--;

        }
     
    }
}