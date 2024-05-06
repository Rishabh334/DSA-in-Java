public class string3 {

    public static void main (String[]args){
        String str = "abcdefg";
        String st= "aijkl";


     //   System.out.println(str.charAt(4)); //getting the char

       // System.out.println(str.substring(2,5)); // for index print using range
 
        /*System.out.println(str.substring(1,6));
        System.out.println(str.substring(1,1));
        System.out.println(str.substring(s));
        System.out.println(str.substring(2));

*/

// Concat;
System.out.println(str.concat(st));
String s ="abchijkl";
if (s.compareTo(str)>0){
    System.out.println(str);

}
else{
    System.out.println(s);
}

    }
    
}
