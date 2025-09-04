package Reto4;
import java.util.stream.*;
import java.util.*;
public class Tesoro {
    private static Hashtable<String, Integer> tesorosHashtable = new Hashtable<>();

    public static void almacenarHashtable(List<Map.Entry<String, Integer>> pares){
        
        for(Map.Entry<String, Integer> par : pares){
            tesorosHashtable.putIfAbsent(par.getKey(), par.getValue());
        }

    }
    public static Map<String, Integer> obtenerTesoro(HashMap<String, Integer> tesorosHashMap,Hashtable<String, Integer> tesorosHashtable){
            Map<String, Integer> tesoroComun = new HashMap<>(tesorosHashMap);

            tesorosHashtable.entrySet().stream()
            .forEach(e -> tesoroComun.put(e.getKey(), e.getValue()));

            return tesoroComun;
    }

}
