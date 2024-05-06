import java.util.*;


public class leetcode1929{
 public static void main (String[]args) {
    // int nums[]=new int [nums.length];
    int nums[]={1,2,1};


        int x = 2*nums.length;

        int ans[]=new int [x];
        int count=0;

        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
            count ++;

        }
int c=count;
        for(int i=c; i<x ;i++){
            ans[i]=nums[nums[i]];

        }
        for(int i=0;i<x;i++){
            System.out.println(ans);
        }
    }
}
