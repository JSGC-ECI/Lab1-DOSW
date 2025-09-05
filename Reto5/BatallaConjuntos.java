package Reto5;

import java.util.*;

public class BatallaConjuntos {
    private static TreeSet<Integer> resultado = new TreeSet<>();

    public static TreeSet<Integer> almacenar(List<Integer> numeros) {
        // Guardar solo números que NO sean múltiplos de 5
        numeros.stream()
                .filter(i -> i % 5 != 0)
                .forEach(resultado::add);
        return resultado;
    }

    public static TreeSet<Integer> unir(HashSet<Integer> conjunto1, TreeSet<Integer> conjunto2) {
        // Unimos ambos conjuntos en un solo TreeSet (ordenado y sin duplicados)
        TreeSet<Integer> union = new TreeSet<>();
        union.addAll(conjunto1);
        union.addAll(conjunto2);

        // Filtrar múltiplos de 3
        union.removeIf(n -> n % 3 == 0);

        // Imprimir con lambda
        union.forEach(n -> System.out.println("Número en arena: " + n));

        return union;
    }

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));

        unir(hashSet, treeSet);
    }
}
