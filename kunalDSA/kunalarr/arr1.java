import java.util.Scanner;
import java.util.Arrays;
public class arr1 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
String[] str = new String[5];
for(int i =0;i<str.length;i++){
    str[i]=sc.next();


}
for(int i =0;i<str.length;i++){
   System.out.print(str[i]);
}

System.out.println (Arrays.toString (str));


    }
}
