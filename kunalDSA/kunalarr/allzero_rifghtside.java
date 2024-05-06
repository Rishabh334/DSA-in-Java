import java.util.*;
import java.util.ArrayList;

public class allzero_rifghtside {
    public static void main(String[] args) {

    //     ArrayList<Integer> list = new ArrayList<>();
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     for (int i = 0; i < n; i++) {
    //         list.add(sc.nextInt());
    //     }

    //     ArrayList<Integer> odd = new ArrayList<>();
    //     ArrayList<Integer> zero = new ArrayList<>();

    //     for (int i = 0; i < n; i++) {

    //         if (list.get(i)== 0) {
    //             zero.add(list.get(i));

    //         } else {
    //             odd.add(list.get(i));

    //         }
            
    //     }
    //     list.removeAll(list);
    //     list.addAll(odd);
    //     list.addAll(zero);
    //     System.out.println(list);
    // }
    Scanner sc =new Scanner (System.in);
    int n=sc.nextInt();

ArrayList <Integer> list =new ArrayList<>();
for(int i =0;i<n;i++){
    list.add(sc.nextInt());
    
}
ArrayList <Integer> odd =new ArrayList<>();
ArrayList <Integer> zero =new ArrayList<>();
for(int i=0 ;i<n;i++){
    if(list.get(i)==0){

        zero.add(list.get(i));
    }
    else{
        odd.add(list.get(i));

    }
}
list.removeAll(list);
list.addAll(odd);
list.addAll(zero);
System.out.println(list);
    }
}
