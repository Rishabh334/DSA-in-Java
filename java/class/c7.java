import java.util.*;
public class c7 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
System.out.println(isArmstrong(n));

    }
    public static boolean isArmstrong(int n){
        int d = digits(n);
        int arm=0;
        int temp=n;
        while (n>0){
            int rem = n%10;
            arm+=Math.pow(rem,d);
            n/=10;
        }
        if(arm==temp){
return true;

        }
        else{
            return false;

        }

    }
    public static int digits (int n){
        int c=0;
        while(n>0){
            n/=10;
            c++;

        }
        return c;

    }

}
