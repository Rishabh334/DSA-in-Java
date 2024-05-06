public class linearstring {
    public static void main(String[]args){
    String str="Rishabh Puri";
    char target='i';
boolean ans =search(str ,target);
System.out.println(ans);
    }



    static boolean search(String str,char target){
if(str.length()==0){
    return false;
}
for(int i=0;i<str.length();i++){
    if(str.charAt(i)==target){
        return true;


    }
}
return false;

    }
}
