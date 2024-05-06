import java.util.Scanner;

public class rotatearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter value of k ");

        int k = sc.nextInt();
        // int[] ans = rotate(arr, k); //kth times roatting the array
        // printarray(ans);
        rotate(arr,k);
        printarray(arr);
    }

    static int[] rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n-k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];

        }
        return ans;

    }

    static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
static void swap(int arr[],int i ,int j){
int temp=0;
arr[i]=temp;
arr[i]=arr[j];
arr[j]=temp;

}
static void reverse(int arr[],int i,int j){
     i= 0;
j=arr.length-1;

    while(i<j){
        swap(arr, i, j);
        i++;
        j--;

}}

static void  rotatepos(int arr[],int k){
    int n =arr.length;
    k=k%n;

    reverse(arr,0,n-k-1);
    reverse(arr,n-k,n);
    reverse(arr,0,n-1);

}


}
