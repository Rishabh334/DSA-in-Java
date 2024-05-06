import java.util.ArrayList;
import java.util.*;
public class arrlist2 {
    public static void main (String[]args){

        Scanner sc = new Scanner (System.in);
        
        // ArrayList<ArrayList<Integer>> list =new ArrayList<>();
        // for(int i=0;i<3;i++){
        //     list.add(new ArrayList<>());

        // }


        // for(int i=0;i<3;i++){
        //      for(int j=0;j<3;j++){
        //         list.get(i).add(sc.nextInt());
        //      }
        // }
        // System.out.println(list);
    int arr[]={1,2,3,4,5,6};
    swap(arr,1,3);

    System.out.println(Arrays.toString(arr)); 
    }
    public  static void  swap(int arr[],int index1,int index2){
int temp=arr[index1];
arr[index1]=arr[index2];
arr[index2]=temp;

    }


    
}
