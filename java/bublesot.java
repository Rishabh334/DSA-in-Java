/*
*
* *
* * *
* * 
*
*/

/*import java.util.*;
public class bublesot {
    public static void main(String []args){


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for(i=0;i<n;i++){
            for(int k=0 ; k<i;k++){
            System.out.print(" * ");
            }
            System.out.println( );
        }
        for(i = 0;n>i;i++){

            for(int j=n;j>i;j--){
          System.out.print(" * ");
        }

            System.out.println();
      }    
 }
    
}*/

/* 
       *
      **
     ***


import java.util.*;
public class bublesot {
    public static void main(String []args){


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
    
        for(i = 1;n>=i;i++){

            for(int j=n;j>i;j--){
          System.out.print(" ");
        }

        for(int j=0;j<i;j++){
            System.out.print("*");

        }
        System.out.println();
  }    
 }
    
}

*/

/*
  
1234
123
12
1


import java.util.*;
public class bublesot {
    public static void main(String []args){


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
    
        for(int i=0;n>=i;i++){

            for(int j=1;j<=n-i;j++){
          System.out.print(j);
        }
        System.out.println();
  }    
 }
}






    */
/* 
1
23 
456
78910




import java.util.*;
public class bublesot {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int number=1;
		for(int i=0;i<=n;i++){
			for(int j=1 ;j<=i;j++){
			
			System.out.print(number);
			number++;

		}	System.out.println();
	}
}
}
*/
/*
 1
 01
 101
 0101


import java.util.*;
public class bublesot {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int number=1;
		for(int i=0;i<=n;i++){
			for(int j=1 ;j<=i;j++){

               int  sum = i+j;
                if (sum%2==0){

                    
                    System.out.print("1");
                }


                else{
                    System.out.print("0");
                }
			
		}	System.out.println();
	}
}
}
 */

 /*
   
 
  *        *
  **      **
  ***    ***
  ****  ****
  **********
  **********
  ****  ****
  ***    ***
  **      **
  *        *
 
 import java.util.*;
 
 public class bublesot {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
 
         for (int i = 0; i <= n; i++) {
             for (int j = 1; j <= i; j++) {
 
                 System.out.print("*");
             }
             int spaces = 2 * (n - i);
             for (int j = 1; j <= spaces; j++) {
                 System.out.print(" ");
 
             }
             for (int j = 1; j <= i; j++) {
                 System.out.print("*");
             }
 
             System.out.println();
 
         }
         for (int i = n; i>=1; i--) {
             for (int j = 1; j <= i; j++) {
 
                 System.out.print("*");
             }
             int spaces = 2 * (n - i);
             for (int j = 1; j <= spaces; j++) {
                 System.out.print(" ");
 
             }
             for (int j = 1; j <= i; j++) {
                 System.out.print("*");
             }
 
             System.out.println();
 
         }
 
     }
 
 }
  */
/*
 
 
  +++++
  +++++
 +++++
+++++
+++++



 
 import java.util.Scanner;
 
 public class bublesot {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
 
         
             for(int i=0 ;i<n;i++){
                for(int j=n-i;j>1;j--){
                    System.out.print(" ");
                }
        
             
             for(int j =0 ;j<n;j++){
                System.out.print("+");
             }

             System.out.println();
 }

 }
}

 */

  
 
 import java.util.Scanner;
 
 public class bublesot {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
 
         int c=n;
         
             for(int i=0 ;i<n;i++){
                for(int j=n-i;j>1;j--){
                    System.out.print(" ");
                }
        
             
             for(int j =0 ;j<n;j++){
                if(i==0||j==0||i==c-1|j==c-1){

                    System.out.print(" *");
                }

                else{
                    System.out.print("  ");
                }
             }

             System.out.println();
 }

 }
}
/* 
import java.util.Scanner;
 
public class bublesot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    
        
            for(int i=0 ;i<n;i++){
               for(int j=1;j<=2*i;j++){
                   System.out.print("  ");
               }

for(int k=n-i;k>=1;k--){
    System.out.print("*");

}

               
               System.out.println();            
}

for(int i=n ;i>=1;i--){
    for(int j=1;j<=2*i;j++){
        System.out.print("  ");
    }

for(int k=n-i;k>=0;k--){
System.out.print("*");

}

    
    System.out.println();            
}

}
}




*/