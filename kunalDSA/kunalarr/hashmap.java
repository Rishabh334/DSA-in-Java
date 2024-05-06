import java.util.*;


public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map =new HashMap<>();
        map.put("Rishabh",12);
        map.put("Rishh",55);
        map.put("Riabh",2);
        System.out.println(map.get("Rishabh"));
        System.out.println(map.getOrDefault("habh",55));


        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(112);
        set.add(1211);
        set.add(13332);
        set.add(11112);
        System.out.print(set);
        
    }



}
