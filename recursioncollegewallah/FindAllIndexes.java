import java.util.*;

public class FindAllIndexes {
    static ArrayList<Integer> FindAll(int arr[], int n, int idx, int target,ArrayList<Integer> ans) {
        if (idx >= n){
            return ans;

        }
        if (arr[idx] == target) {
            ans.add(idx);
        }
       return FindAll(arr, n, idx + 1, target,ans);
    }

    public static void main(String[] args) {
        int arr[] = { 11, 1, 1, 14, 7, 5, 5, 6, 7, 7, 8, 0 };
        int n = arr.length;
        int target = 7;

        ArrayList<Integer> ans = FindAll(arr, n, 0, target,new ArrayList<>());
        for (Integer integer : ans) {
            System.out.print(integer + " ");

        }
    }
}
