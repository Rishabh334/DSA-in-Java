import java.util.*;

public class permu {
   public static void main(String[]args){
    
Scanner  sc  =new Scanner (System.in);
String str = sc.nextLine();

if(str.length()==3){
for(int i =0;i<str.length();i++){
    for(int j =0;j<str.length();j++){
    for(int k =0;k<str.length();k++){
    if(i!=j && j!=k && k!=i){
        System.out.println(str.charAt (i) + " " + str.charAt(j)+ " "+ str.charAt(k));
    }
}
}
}
}

   } 
}
