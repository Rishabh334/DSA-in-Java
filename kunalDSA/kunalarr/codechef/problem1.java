import java.util.*;
public class problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
	    int n = sc.nextInt();
		int arr[]=new int [n];
        int x=0;

		for(int i=0 ;i<arr.length-1;i++){
            arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length-1;j++){
		    if(arr[j]>arr[j+1]){

                x=x-arr[j];
            }
		}
        System.out.print(x);
	}
    }
