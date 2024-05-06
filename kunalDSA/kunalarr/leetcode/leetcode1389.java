/**
 * leetcode1389
 */
import java.util.*;

public class leetcode1389 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n  = sc.nextInt();
        int nums[] = new int[n];
        int index[] = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            index[i] = sc.nextInt();
        }

        int[] ans =  createTargetArray(nums, index);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i] + " ");
        }
        
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }

        int j = 0;
        for(j=0; j<nums.length;j++){
            nums[j] = list.get(j);

        }
        return nums;
    }
}