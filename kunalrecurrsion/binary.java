public class binary {
    static int search(int arr[],int target,int s,int e){
        if(s>e)return -1;
        int  mid= s+(e-s)/2;

        if(target==arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
        
        return search(arr, target, s, mid-1);

        }
        
           return  search(arr, target, mid+1, e);

    
    

    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,7,11};
       System.out.println(search(arr, 7, 0, arr.length-1));
    }
    
}
