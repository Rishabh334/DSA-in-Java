public class string9 {

    public static void main(String args[]){
    
    String str="abcdefg";

    for(int i = 0;i<8;i++){
        for(int j=i+1;j<=7;j++){
            System.out.println(str.substring(i,j)+" " );
        }
    }
    
    }
    
}