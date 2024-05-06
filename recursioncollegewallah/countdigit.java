import java.util.*;

public class countdigit {

  public static int digit (int n){
    if(n==0) return 0;

    return 1 + digit(n/10);

    }
    public static void main(String[] args) {
        System.out.print(digit(1234));
    }
}
