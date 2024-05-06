import java.util.*;


public class searchelement {

    static int search(int arr[],int target,int idx){
      
        if(idx==arr.length-1)return -1;

        if(arr[idx]==target)return idx;

          return  search(arr, target, idx+1);

        
    }
    static int lastsearch(int arr[],int target,int idx){
   
        if(idx==-1)return -1;
        
        if(arr[idx]==target)return idx;

        return lastsearch(arr, target, idx-1);

        
    }

    static ArrayList<Integer> Find(int arr[],int target,int idx,ArrayList<Integer>list){
   
        if(idx==arr.length)return list;
        
        if(arr[idx]==target)list.add(idx);

        return Find(arr, target, idx+1,list);

        
    }
static ArrayList<Integer> lis=new ArrayList<>();

    static ArrayList<Integer> findAll(int arr[],int target,int idx){
      
        if(idx==arr.length)return lis;
        if(arr[idx]==target){
            lis.add(idx);



        }

        findAll(arr, target, idx+1);
    //     ArrayList <Integer> ansFrombelowcalls=
    //  lis.addAll(ansFrombelowcalls)   ;
    return lis;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,4,4,4,6,6};

      
        int target=4;

        System.out.println(search(arr, target, 0));
        System.out.println(lastsearch(arr,target,arr.length-1));
            ArrayList<Integer>ans=Find(arr, target, target,new ArrayList<>());
          System.out.println( findAll(arr, target, target)); 
            System.out.println(ans);
    }
}
