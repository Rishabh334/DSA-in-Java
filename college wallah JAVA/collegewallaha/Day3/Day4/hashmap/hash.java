import java.util.*;


public class hash {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        mp.put("Rishabh",99);
        mp.put("Sourav",88);
        mp.put("Diku",77);
        mp.put("haggu",66);
    //    System.out.println(mp.get ("yash")); 
    //    System.out.println(mp.get ("Diku")); 
    //    System.out.println(mp.containsKey("Diku")); 
    //    System.out.println(mp.remove("sourav     ")); 
       System.out.println(mp.values()); 
       System.out.println(mp.keySet()); 
    //    System.out.println(mp.putIfAbsent("puri",888)); 
    //    for (String key : mp.keySet()) {
    //     System.out.printf("Age of %s is %d\n", key ,mp.get(key));
        
    //    }
    //    System.out.println();
    //    for (Map.Entry<String , Integer> e : mp.entrySet()) {
    //     System.out.printf("Age of %s is %d\n", e.getKey() ,e.getValue());
        
    //    }
    //    System.out.println();
    //    for(var e:mp.entrySet() ){
    //     System.out.printf("Age of %s is %d \n",e.getKey(),e.getValue());
    //    }

    for (String key :mp.keySet()){
        System.out.printf("age of %s is %d\n",key,mp.get(key));
    }
    }
}
