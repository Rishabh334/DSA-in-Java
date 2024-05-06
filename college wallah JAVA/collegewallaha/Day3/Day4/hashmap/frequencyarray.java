import java.util.*;


public class frequencyarray {
    public static void main(String[] args) {
         int arr[]={1,1,1,4,4,4,5,5,5,3,3,3,7,7,7,0};
         Map<Integer,Integer> freq=new HashMap<>();
         for(int el:arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);

            }
            else{
                freq.put(el,freq.get(el)+1);

            }
         }
         System.out.println("Frequency map");
         System.out.println(freq.entrySet());




        //  for(int el:arr){
        //     if(!freq.containsKey(el)){
        //         freq.put(el, 1);

        //     }
        //     else{
        //         freq.put(el,freq.get(el)+1);

        //     }
        //  }
        //  System.out.println(freq.entrySet());
    
    for(int el:arr){
        if(!freq.containsKey(el)){
            freq.put(el,1);

        }

        else{
            freq.put(el,freq.get(el)+1);

        }
    }
    System.out.println(freq.entrySet());
    
    
    }
}
