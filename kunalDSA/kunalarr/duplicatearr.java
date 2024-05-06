import java.util.*;
public class duplicatearr {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,5,6,7};
       removeduplicate(arr);
    }

static void removeduplicate(int []arr){
    ArrayList <Integer>list=new ArrayList<>();

    HashSet<Integer> set= new HashSet<Integer>();




    System.out.println(set);
    list.addAll(set);
    for(int i=0;i<list.size();i++){
        list.get(i);
    }
}   

}
    
    
