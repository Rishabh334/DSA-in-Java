/*import java.util.*;
public class string6 {
    public static void main(String args[]) {

	Scanner sc = new Scanner (System.in);

	String str = sc.next();

	boolean ans=ispalindrom(str);
	System.out.print(ans);

    }
	public static boolean ispalindrom(String str){
		int i = 0;
		int j=str.length()-1;


		while (i<=j){
if(str.charAt(i)!=str.charAt(j)){
return false;

		}
		 i++;
		 j--;

}
return true;


}
		


}
*/


import java.util.*;

public  class string6{
	public static void main(String []args){
	
	Scanner sc = new Scanner (System.in);
	String st=sc.nextLine();
	// sc.nextLine();
	// String st2=sc.nextLine();
	int i = 0;
    int max = 0;
	int Mainmax = max;
	while(i!=st.length()){
		if(st.charAt(i) == 'a' ||st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u'){
			max++;
		}
		else{
			if(Mainmax < max){
				Mainmax = max;
			}
			max = 0;
		}
      i++;
	}

    System.out.println(Mainmax);
    // a b c b a 
    // System.out.println(st);
    // System.out.println(st2);
	// StringBuilder sb1 = new StringBuilder(st);  
	// StringBuilder sb2 = new StringBuilder(st2);

	// System.out.println(sb1.append(sb2));
// 	sb2.reverse();
// if(sb1.compareTo(sb2) == 0){
// 	System.out.println("valid");
// }
// else{
// 	System.out.println("not valid");
// }
	


//  boolean ans = ispaolindom(String str);

// 	System.out.println(ans);

	
	
// 	}

// public static boolean  ispaolindom(str){
// 	int i = 0 ;
// 	int j = str.length()-1;
// 	while(i<j){
// 		if(str.charAt(i)!=str.charAt(j)){
// 			return false;

// 		}

// 		i++;
// 		j--;
// 	}
// 	return true;
	
}

}


Scanner sc = new Scanner (System.in);
String str = sc.nextLine();
String str1 =sc.nextLine();
