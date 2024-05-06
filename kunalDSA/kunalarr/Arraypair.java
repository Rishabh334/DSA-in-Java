public class Arraypair {
//     public static void main(String[] args) {
//           int number[]={2,4,6,8,10};
// printpairs(number);
// ;
//     }
//     static void printpairs(int number[]){
//         int tp=1;
//         for(int i=0 ; i<number.length;i++){
//             int curr=number[i]  ;
// for(int j=i+1;j<number.length;j++){
//     System.out.print("("+curr + ","+number[j]+")");
//     tp++;

// };
//         }
//         System.out.println();

//     }
// }


public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
pair(arr);
}
static void pair(int arr[]){
    for(int i=0;i<arr.length;i++){
        int curr= arr[i];
        for(int j= i+1; j<arr.length;j++){
                System.out.print("["+ curr +"," + arr[j]+ "]");
        }
        System.out.println();
    }
}



}