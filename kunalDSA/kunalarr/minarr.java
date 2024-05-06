public class minarr {
    public static void main(String[]args){
        int arr[]={1,12,43,1,65,767,6,0};
        System.out.println(minele(arr));

    }
   public  static int  minele(int[]arr){

        int ans=arr[0];


for(int i=1;i<arr.length;i++){
    if(arr[i]<ans){
         ans=arr[i];

    }

}  


return ans;


    }

}
