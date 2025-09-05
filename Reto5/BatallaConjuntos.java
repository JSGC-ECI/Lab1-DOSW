package Reto5;

import java.util.*;

public class BatallaConjuntos {
    private static TreeSet<Integer> resultado = new TreeSet<>();

    public static TreeSet<Integer> almacenar(List<Integer> numeros) {
        numeros.stream()
                .filter(i -> i % 5 != 0)
                .forEach(resultado::add);
        return resultado;
    }

    public static TreeSet<Integer> unir(HashSet<Integer> conjunto1, TreeSet<Integer> conjunto2) {
        TreeSet<Integer> union = new TreeSet<>();
        union.addAll(conjunto1);
        union.addAll(conjunto2);

        union.removeIf(n -> n % 3 == 0);

        union.forEach(n -> System.out.println("Número en arena: " + n));

        return union;
    }

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));

        unir(hashSet, treeSet);
    }
}
