import java.util.Arrays;
import java.util.Scanner;


// public class linear2D {
//   public static void main (String[]args)  {
//     int target=7;

//     int [][]arr= {{1,2,3},{1234,5465,65,7},{9,7,6,5,4,3}};
//     int[] ans =  search(arr,target); 
// System.out.println(Arrays.toString(ans));
  
// }

// static int[] search(int [][]arr,int target){
   
//     for(int i=0;i<arr.length;i++){
//         for(int j=0;j<arr[i].length;j++){
//          if(arr[i][j]==target){
//              return new int []{i,j};

//          }
//         }
//     }
//     return null;

// }
// }



// public class linear2D{

//     public static void main(String[]args){

//         Scanner sc =new Scanner (System.in);
//         System.out.println("Enter element to search");
// int target =sc.nextInt();

//         int [][]arr={{12,3,345,46,4},{234,55,6,76,},{12,4,5,6,7,7,8}};

//         int[]ans=linearsearch(arr,target);

// System.out.print("your element is here ");
// System.out.println(Arrays.toString(ans));
//     }



// static int[] linearsearch(int[][]arr,int target){



//     for(int row=0;row<arr.length;row++){
//         for(int col=0;col<arr[row].length;col++){
//             if(arr[row][col]==target){
//                 return new int []{row,col};

//             }
//         }

        
//     }
//     return null;

    

// }

// }


public class linear2D{
    public static void main(String[]args){

        
             Scanner sc =new Scanner (System.in);
                System.out.println("Enter element to search");

                int [][]arr={{12,3,345,46,4},{234,55,6,76,},{12,4,5,6,7,7,8}};
        
                int ans=min(arr);
        
        System.out.print("your element is here ");
        System.out.println((ans));
    }

static int[] min(int [][]arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
        
        }
    
    }

}



    }



