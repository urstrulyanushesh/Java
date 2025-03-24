package CollectionsLibrary.Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("CR7",1000);
        map.put("LM10",900);
        map.put("NJr",800);

        System.out.println("ValueOf NJr:"+map.get("NJr"));
        if(map.containsKey("LM10")){
            System.out.println("Messi is Present!!");
        }
        System.out.println(map.keySet());
        System.out.println(map.values());


        for(String key: map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
    }
}
