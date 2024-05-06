import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {

                System.out.print("  ");

            }
            for (int j = 0; j <= i; j++) {
                 
                System.out.print(i - j + 1);

            }
            for (int j = 1; j <= i; j++) {

                System.out.print("  ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);

            }

            System.out.println();
        }


        int k = n;
          for (int i = 0; i <= n; i++) {
              for (int j = 0; j <= i; j++) {
                  
                  System.out.print("  ");
                  
                }
                for (int j = 1; j <= n - i; j++) {
    
                    System.out.print(k - j + 1);
    
                }


                for (int j = 1; j <= n - i; j++) {
    
                    System.out.print("  ");
    
                }
                for (int j = 0; j < n - i; j++) {
                    System.out.print(j + 1);
    
                }
                k--;

            System.out.println();
        }






        





    }
}
