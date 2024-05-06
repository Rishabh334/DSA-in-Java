/*import java.util.*;
public class func2 {
    

    public static int  printSum(int a ,int b){

        int sum = a+b;
        return sum;
    
    }
    public static void main(String args[]){

       // func2 st = new func2();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = printSum(a, b);
        System.out.println(sum);
        

    

    }
}
*/

/* 
import java.util.*;
public class func2 {

public static int printSum(int a , int b){
    int sum = a*b;
    return sum;
}

public static void main (String args[]){
Scanner sc=new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

int sum = printSum(a,b);
System.out.println("the sum is "+sum);


}
}*/


import java.util.*;
public class func2{
    public static void factorial(int a){

        int fact =1;

        for (int i = a; i>=1;i--){
            fact = fact *i;

        }
        System.out.println(fact);
        return;
    }



    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        factorial(a);

    }
    }
