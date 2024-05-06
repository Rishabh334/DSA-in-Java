import java.util.*;

public class alternatesum {

    static int seriesSum(int n){
        if(n==0)return 0;
        if(n%2==0){
            return seriesSum(n-1) - n ;//here 1-2+3-4 even case ther will be negative singh

        }
        else{ 
            return seriesSum(n-1) + n ;//odd case

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x= sc.nextInt();
        System.out.print(seriesSum(x));

        
    }
}
