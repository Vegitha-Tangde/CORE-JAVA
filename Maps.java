//MAPS
//Iterate in Map
import java.util.*;
public class Maps{
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();
        //To print the keys and values in order of insertion
        //LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        //To print the keys and values in Sorted order
        //TreeMap<String, Integer> hm = new TreeMap<>();
        hm.put("ABC",1);
        hm.put("DEF",2);
        hm.put("GHI",3);
        hm.put("JKL",4);
        hm.put("XYZ",5);

        //To print only keys
        // for(String key : hm.keySet()){
        //     System.out.println(key);
        // }
        //To print only values
        // for(Integer val : hm.values()){
        //     System.out.println(val);
        // }
        //To print both keys and values
        for(Map.Entry<String,Integer> entry:hm.entrySet()){
            String key = entry.getKey();
            Integer val = entry.getValue();

            System.out.println(key + " "+ val);
        }
    
    }
}
