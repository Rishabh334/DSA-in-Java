import java.util.*;

public class uppertolower {
    public static void main(String[] args) {
        
    String strr="abcbcbcb";
    String st="";

    for(int i =0;i<strr.length();i++){
        char ch=strr.charAt(i);
        if(ch>='a'&&ch<='z'){
            st+=(char) (ch-32);

        }
        else st+=(char) (ch+32);

    }

    System.out.println(st);
   } 


        // Scanner sc = new Scanner(System.in);
        // StringBuilder str = new StringBuilder(sc.nextLine());
        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(i);
        // boolean flag =true;

        // if(ch==' ') continue;

        // int asci=(int)ch;

        // if(asci>=97){
        // flag=false;

        // }
        // if(flag==true){
        // asci+=32;
        // char dh = (char)asci;
        // str.setCharAt(i, dh);
        // }
        // else{
        // asci-=32;
        // char dh =(char)asci;
        // str.setCharAt(i,dh);

        // }

        // }
        // System.out.println(str);
        // Scanner sc = new Scanner(System.in);
        // StringBuilder str = new StringBuilder(sc.nextLine());
        // for (int j = 0; j < str.length(); j++) {

        // char cc = str.charAt(j);
        // int asci = (char) cc;
        // if (cc == ' ')
        // continue;
        // boolean flag = true;
        // if (asci >= 97) {
        // flag = false;

        // }
        // if (flag == true) {
        // asci += 32;
        // char dh = (char) asci;
        // str.setCharAt(j, dh);

        // } else {
        // asci -= 32;
        // char dh = (char) asci;
        // str.setCharAt(j, dh);

        // }

        // }
        // System.out.println(str);

        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     int asci = (int) ch;
        //     if (ch == ' ')
        //         continue;
        //     boolean flag = true;
        //     if (asci >= 97)
        //         flag = false;
        //     if (flag == true) {
        //         asci += 32;
        //         char dh = (char) asci;
        //         str.setCharAt(i, dh);
        //     } else {
        //         asci -= 32;
        //         char dh = (char) asci;
        //         str.setCharAt(i, dh);

        //     }
        // }
        // System.out.println(str);


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asci = (int) ch;
            if(ch==' ')continue;
            boolean flag=true;
            // char dh =(char)asci;

            if(asci>=97) flag=false;
            if(flag==true){
                asci+=32;
                char dh = (char)asci;
                str.setCharAt(i, dh);

            }
            else{
                asci-=32;
                char dh = (char)asci;
                str.setCharAt(i, dh);

            }
      

        }
        System.out.println(str);

    }



