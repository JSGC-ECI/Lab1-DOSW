package Reto4;
import java.util.stream.*;
import java.util.*;
public class Tesoro {
    private static Hashtable<String, Integer> tesoro = new Hashtable<>();

    public static void almacenar(List<Map.Entry<String, Integer>> pares){
        
        for(Map.Entry<String, Integer> par : pares){
            tesoro.putIfAbsent(par.getKey(), par.getValue());
        }

    }
}
