import java.util.Arrays;




public class sourav {
    public static void main(String[] args) {
        
        int arr[] = { 3, 1, 2, 4 ,9};

       System.out.println(Arrays.toString(evenarr(arr))); 
    }

//     static int[] evenarr(int[] arr) {

        
//         int i=0;

// int j=1;
//      while( i<arr.length && j<arr.length){

     

//             if (arr[i] % 2 != 0 && arr[j] % 2 != 0) {
                
//                 j++;




//             } else if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 i++; 
//                 j++;


//             }

//             else if (arr[i] % 2 == 0 && arr[j] % 2 != 0) {
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 i++; j++;

//             }
//               else {
//                 i++;
//                 j++;
//             }

//         }
//         return arr;

//     }



static int [] evenarr(int arr[]){
    int i=0;
    int j=1;
    while(i<arr.length&&j<arr.length){
        if(arr[i]%2!=0 && arr[j]%2!=0){
            j++;

        }
        else if(arr[i]%2!=0 && arr[j]%2==0){
             int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; 
                j++;
        }
        else if(arr[i]%2==0 && arr[j]%2!=0){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j++;

        }
        else{
            i++; 
            j++;

        }
    }
    
    return arr;
}
}



