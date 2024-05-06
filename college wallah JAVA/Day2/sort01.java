import java.util.*;
public class sort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // sortedarray(arr);
        // sort(arr);
    int ans[]=ProOptimisedApproch(arr);

        System.out.println("sorted array is ");
        printarray(ans);
    }

    static void printarray(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    static void Swap(int arr[],int i ,int j) {
        
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
    }

    // static void sortedarray(int arr[]){
    // int n = arr.length;
    // int zero=0;
    // for (int i = 0; i < arr.length; i++) {
    // if(arr[i]==0){
    // zero++;

    // }
    // }
    // for (int i = 0; i < arr.length; i++) {
    // if(i<zero){
    // arr[i]=0;

    // }
    // else{
    // arr[i]=1;

    // }
    // }

    // }

    // OPTIMIZED APPROCH
    // static void sort(int arr[]){
    //     int n =arr.length;
    //     int left=0;;
    //     int right=n-1;
    //     while (left<right){
    //         if(arr[left]==1&&arr[right]==0){
    //             Swap(arr,left,right);
    //             left++;
    //             right--;

    //         }
    //          if(arr[left]==0){
    //             left++;


    //          }
    //          if(arr[right]==1){
    //             right--;

    //          }
    //     }
    // }
static int [] ProOptimisedApproch(int arr[]){
int i=0;
int n =arr.length;
for (int j = 0; j < arr.length; j++) {
    if(arr[j]==0){
        int a=arr[i];
        arr[i]=arr[j];
        arr[j]=a;
        i++;
    }
    
}
return arr;
}
}
