package Reto4;
import java.util.*;

public class Tesoro {

    private Map<String, Integer> almacenar = new HashMap<>();

    public void almacenar(List<Map.Entry<String, Integer>> pares) {
        for (Map.Entry<String, Integer> par : pares) {
            almacenar.putIfAbsent(par.getKey(), par.getValue()); // conserva primer valor
        }
    }