import java.util.*;


public class class2 {
    public static void main(String[]args){
Scanner sc = new Scanner (System.in);
//int n = sc.nextInt();
int arr[]={4,6,8,4,5,6,78,90,987,65,4};


for(int i =0 ; i<arr.length-1;i++){
    for(int j =0 ; j<arr.length-1-i;j++){
        if (arr[j]>arr[j+1]){
            //swap
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

        }
    }

}
for(int i=0 ;i<arr.length;i++){
    System.out.println(arr[i]);
}





    }
}
