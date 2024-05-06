public class occurence {
    public static void main(String[]args){
        String str= "RRRaaammm";
        char arr[]=str.toCharArray();

        char ch = 'R';

        int count=0;

        for(int i= 0 ; i <str.length()-1;i++){
            char st= charAt(i);

                   if(ch==st){
                    count++;

                   }

        }
        System.out.println(count);;

    }
}
