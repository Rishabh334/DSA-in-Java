public class checksorted {
    static boolean sorted(int arr[],int idx){
        if(arr.length-1==idx)return true;

        return arr[idx]<=arr[idx+1]&& sorted(arr, idx+1);

    }



    public static void main(String[] args) {
        int arr[]={1,4,5,6,7,7};
      System.out.println(sorted(arr, 0));  

    }
}
