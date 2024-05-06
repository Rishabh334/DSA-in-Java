import java.util.*;
public class leetcode1408
{
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int arr[]=new int [n];
int nums[]=new int [n];
    for(int i=0;i<arr.length;i++){

        arr[i]=sc.nextInt();
    }


    int sum =0;
arr[i]=nums[i];

    for(int i=0;i<arr.length;i++){
        if(i<j){

        nums[i]=nums[i-1]+arr[i];
        }

    }

    System.out.println(sum);


    }
}