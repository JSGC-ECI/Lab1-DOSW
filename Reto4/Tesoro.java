package Reto4;
import java.util.*;
import java.util.stream.*;

public class Tesoro {
    private static Hashtable<String, Integer> tesorosHashtable = new Hashtable<>();
    private static Map<String, Integer> tesoro = new HashMap<>();

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



    
    public static void almacenar(List<Map.Entry<String, Integer>> pares) {
        for (Map.Entry<String, Integer> par : pares) {
            tesoro.putIfAbsent(par.getKey(), par.getValue());
        }
    }
    public static Map<String, Integer> ordenarAntesDeImprimir(Map<String, Integer> tesoroComun){
        return tesoroComun.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));
    }
    public static void imprimir(Map<String, Integer> tesoroComun){
        tesoroComun = ordenarAntesDeImprimir(tesoroComun);
        tesoroComun.entrySet().stream()
            .map(e -> "Clave: " + e.getKey().toUpperCase() + " | Valor: " + e.getValue())
            .forEach(System.out::println);
    }

}
