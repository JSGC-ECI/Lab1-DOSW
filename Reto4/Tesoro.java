package Reto4;
import java.util.*;

public class Tesoro {

    private static Map<String, Integer> almacenar = new HashMap<>();

    public static void almacenar(List<Map.Entry<String, Integer>> pares) {
        for (Map.Entry<String, Integer> par : pares) {
            almacenar.putIfAbsent(par.getKey(), par.getValue());
        }
    }

    public void mostrarHashMap() {
        hashMap.forEach((k, v) ->
                System.out.println("Clave: " + k + " | Valor: " + v)
        );
    }

    public static Map<String, Integer> obtenerTesoro(HashMap<String, Integer> tesorosHashMap,Hashtable<String, Integer> tesorosHashtable)

}
