import java.util.*;


public class reversearraylist {

    public static void main(String[] args) {
          ArrayList <Integer> list =new ArrayList <>();
          list.add(324);
          list.add(1);
          list.add(34);
          list.add(334);
          list.add(4);
          list.add(46);
          list.add(6);
          list.add(56);
          list.add(9);
          System.out.println("original "+ list);
         Collections.sort(list);
         System.out.println(list); //asending order sort
        //  Collections.sort(list,Collections.reverseOrder());

          Collections.reverse(list);    //reverse array
        //   System.out.println("reverse "+ list);          // decending order
        System.out.println("desending order " + list);
      }
    }

