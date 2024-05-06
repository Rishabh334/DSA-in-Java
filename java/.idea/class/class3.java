public class class3 {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 7, 5, 43, 8 };
        for (int i = 0; i < arr.length ; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0) {

                if (arr[j] > temp) {

                    arr[j + 1] = arr[j];

                }

                else {
                    break;

                }

                j--;

            }
            arr[j+1]=temp;

        }
        for(int i =0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}