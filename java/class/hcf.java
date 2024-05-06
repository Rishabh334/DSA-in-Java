import java.util.*;

public class hcf {
    public static void main(String args[]){
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();

int x= sc.nextInt();


while(x%n !=0){
  int rem= x%n;

    x=n;
n=rem;
}
System.out.println(n);
    }
    
}
