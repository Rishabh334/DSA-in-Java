import java.util.Scanner;
import  java.util.ArrayList;

public class arrlist1 {
   
public static void main(String []args){

ArrayList<Integer> list=new ArrayList<>();
    //   ArrayList<Integer> list =new ArrayList<>(10);
     Scanner sc =new Scanner (System.in);
for(int i=0 ;i<5;i++){
    list.add(sc.nextInt());

}
int n = 222;
list.add(3, n);


for(int i=0;i<5;i++){
    System.out.println(list.get(i));

}

}
}
