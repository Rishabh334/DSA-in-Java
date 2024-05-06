import java.util.*;


public class firstrepiting {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter size");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();

    }
    int x = 0;

    System.out.println(Firstrep(arr));

   }

   static int Firstrep(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j = i+1 ;j<arr.length;j++){
            if(arr[i]==arr[j]){
                return i;

            }
        }
    }
    return -1;


   }
}
