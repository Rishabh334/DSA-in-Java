 import java.util.ArrayList;
import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // Scanner sc = new Scanner(System.in);
        // int n = 0;
        // while(n != -99){
        //     int a = sc.nextInt();
        //     list.add(a);
        //     n = a;
        // }
        // int k = sc.nextInt();
        // System.out.println(list.remove(k));
        // System.out.println(list.remove(list.size() - 1));
        // System.out.println(list);
ArrayList<Integer>list=new ArrayList<>();
Scanner sc = new Scanner (System.in);
int n= 0;
while(n!=-1){
   int a= sc.nextInt();
   list.add(a);
   n=a
;
}
int k =sc.nextInt();
System.out.println(list.remove(k));;
System.out.println(list.remove (list.size()-1));
System.out.println(list);
}
}
