public class LcmUsingGdc {
    static int lcm(int x,int y){
        if(y==0)return x;
       

        return lcm(x*y/(y,x%y));


    }
    public static void main(String[] args) {
        int a =10;
        int b=20;
        System.out.println(lcm(a,b));
    }
}
