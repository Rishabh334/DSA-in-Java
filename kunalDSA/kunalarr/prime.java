import java.util.*;

public class prime {
    public static void main(String[] args) {
        int n = 100;
        int count = 1;
        int i = 2;
        while( count <= n ){
            int j = 2;
            int flag = 0;
            while(j < i){+
                if(i%j == 0){
                    flag = 1;
                    break;
                }
                j++;
            }
            if(flag == 0){
                System.out.println(count + " -> " + i + " ");
                count++;
            }
            i++;
        }
        
    }
}
