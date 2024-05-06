public class string10 {
    public static void main (String []args){

StringBuilder str = new StringBuilder("rishabh ");
StringBuilder ac = new StringBuilder("Puri");

str.setCharAt(0, 'R');

str.append(ac);

System.out.println(str);
    
}
}