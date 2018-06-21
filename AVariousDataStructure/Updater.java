package AVariousDataStructure;

import java.util.HashMap;
import java.util.Map;

public class Updater {
    static volatile Map<String ,String> m;
    public synchronized void update(String k, Integer v){
        if (m == null){
            m = new HashMap<>();

        }
/*        Integer pv = m.getOrDefault(k,0);
        m.put(k, pv+v);*/
    }



}
