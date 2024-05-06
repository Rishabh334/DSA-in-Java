import java.util.Scanner;

public class rangesum {
    //  public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     int n = sc.nextInt();
    //     int arr[]=new int [n];
    //     for(int i=1;i<arr.length;i++){
    //         arr[i]=sc.nextInt();
    //     }
        
    //     System.out.println("Enter number of queries");
    //     int q=sc.nextInt();
    //     int []p=prefixsum(arr);
    //    while(q-- >0){
    //    int l =sc.nextInt();
    //     int r=sc.nextInt();

    //     System.out.println("Enter range");
    //     int ans =p[r]-p[l-1];
    //     System.out.println(ans);

    //    }
    // }    
    static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // static int[] prefixsum(int arr[]){
    //     int n=arr.length;
    //     for(int i=1;i<arr.length;i++){
    //         arr[i]=arr[i]+arr[i-1];

    //     }
    //     return arr;
    static int[]prefixsum(int arr[]){
        int n=arr.length;

        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+arr[i-1];

            
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int p[]=prefixsum(arr);
        System.out.println("enter queries");
        int q=sc.nextInt();

        while(q-- >0){
            int l =sc.nextInt();
            int r=sc.nextInt();
            int ans=p[r]-p[l-1];
            System.out.println(ans);
        }
    }


    }


