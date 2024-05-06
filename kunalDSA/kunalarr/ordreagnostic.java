public class ordreagnostic {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 56, 66, 67, 89, 777 };
        int target = 89;
        int pr = agnostic(arr, target);
        System.out.println(pr);
    }

    static int agnostic(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        boolean isAsc = arr[start] <= arr[end];
        while (start <= end) {
            if (mid == target) {
                return mid;
            }
            if (isAsc) {

                if (target < arr[mid] ) {
                    end = mid - 1;

                } else {
                    start = mid + 1;

                }
                
            }
            if(target>arr[mid]){
                end=mid-1;
                
            }
            else{
                start=mid+1;

            }
        }
return -1;

    }
}