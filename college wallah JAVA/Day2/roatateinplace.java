import java.util.Scanner;

public class roatateinplace {
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
        rotatepos(arr, k);
        printarray(arr);
    }

    static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp=0;

        arr[i] = temp;
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void reverse(int arr[], int i, int j) {

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;

        }
    }
static void optrev(int arr[],int i ,int j){
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
i++;j--;


    }
}
    static void rotatepos(int arr[], int k) {
        int n = arr.length-1;
        k = k % n;

        optrev(arr,0, n - k - 1);
        optrev(arr, n - k, n);
        optrev(arr, 0, n - 1);

    }

}
