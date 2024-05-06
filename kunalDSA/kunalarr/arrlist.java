import java.util.ArrayList;


public class arrlist {
    public static void main(String[]args){
        ArrayList<Integer> list =new ArrayList<>(10);
list.add(10);
list.add(104);
list.add(10);
list.add(1099);
list.add(180);
list.add(80);
list.add(10);
list.add(10);
list.add(10);
list.add(10);

list.set(2,9);
list.remove(4);

System.out.println(list);
    }
}
