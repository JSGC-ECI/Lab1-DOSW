package Reto4;
import java.util.stream.*;
import java.util.*;
public class Tesoro {
    public static Map<String, Integer> almacenar(List<Map.Entry<String, Integer>> pares) {
        Map<String, Integer> mapa = new HashMap<>();
        for (Map.Entry<String, Integer> par : pares) {
            mapa.putIfAbsent(par.getKey(), par.getValue()); // conserva el primero
        }
        return mapa;
}
