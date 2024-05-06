import java.lang.Math;


// public class linear {
//     public static void main(String[]args){
//         int target=11;
//         int arr[]={1,2,4,5,66,7,8,9};

// int ans=linearsearch(arr, target);
// System.out.println(ans);
       
//     }

//     static int linearsearch(int[]arr, int target){

//     if(arr.length==0){
//         return -1;

//     }
//     for(int i=0;i<arr.length;i++){
//         //int element= arr[i]; or you can store this in variable for comparision so kindly type fast
        
//         if(target==arr[i]){
//             return i;

//         }
//     }
//     return -1;
//     }

// }
public class linear {
    public static void main(String[]args){
        int target=11;
        int arr[]={1,2,4,5,66,7,8,9};

int ans=linearsearch(arr, target);
System.out.println(ans);
       
    }

    static int linearsearch(int[]arr, int target){

    if(arr.length==0){
        return -1;

    }
    for(int i=0;i<arr.length;i++){
        //int element= arr[i]; or you can store this in variable for comparision so kindly type fast
        
        if(target==arr[i]){
            return i;

        }
    }
    return Integer.MAX_VALUE;
    }

}