import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n =sc.nextInt();
        int count =0;
        
 for (int i = 0; i < Math.sqrt(n); i++) {
    if(n%i!=0){
        count ++;

        
    }
    
}

System.out.print(count);

    }
}
