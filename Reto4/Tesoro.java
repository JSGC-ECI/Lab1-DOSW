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

    public static void main(String[] args) {
        // Pares para el HashMap
        List<Map.Entry<String, Integer>> paresHashMap = List.of(
            Map.entry("oro", 5),
            Map.entry("plata", 3),
            Map.entry("oro", 7),
            Map.entry("diamante", 10)
        );
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (Map.Entry<String, Integer> par : paresHashMap) {
            hashMap.put(par.getKey(), par.getValue());
        }

        // Pares para el Hashtable
        List<Map.Entry<String, Integer>> paresHashtable = List.of(
            Map.entry("plata", 8),
            Map.entry("rubí", 4),
            Map.entry("oro", 12),
            Map.entry("esmeralda", 6)
        );
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        for (Map.Entry<String, Integer> par : paresHashtable) {
            hashtable.put(par.getKey(), par.getValue());
        }

        // Obtener el tesoro combinado
        Map<String, Integer> tesoroComun = obtenerTesoro(hashMap, hashtable);

        // Imprimir el tesoro ordenado
        imprimir(tesoroComun);
    }
}
