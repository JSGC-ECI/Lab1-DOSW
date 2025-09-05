package Reto5;

import java.util.*;
import java.util.stream.*;

public class BatallaConjuntos {
    public static TreeSet<Integer> almacenarTreeSet(List<Integer> numeros) {
        return numeros.stream()
                .filter(i -> i % 5 != 0)
                .collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
    }

    public static HashSet<Integer> almacenarHashSet(List<Integer> numeros) {
        return numeros.stream()
                .filter(i -> i % 3 != 0)
                .collect(HashSet::new, HashSet::add, HashSet::addAll);
    }

    public static TreeSet<Integer> unir(HashSet<Integer> conjunto1, TreeSet<Integer> conjunto2) {
        TreeSet<Integer> resultadoUnido = new TreeSet<>();
        resultadoUnido.addAll(conjunto1);
        resultadoUnido.addAll(conjunto2);
        return resultadoUnido;
    }

    public static void imprimir(TreeSet<Integer> conjunto) {
        conjunto.stream()
                .forEach(n -> System.out.println("Número en arena: " + n));
    }

    public static void main(String[] args) {
        HashSet<Integer> hashSetResultado = almacenarHashSet(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        TreeSet<Integer> treeSetResultado = almacenarTreeSet(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));
        TreeSet<Integer> resultadoUnido = unir(hashSetResultado, treeSetResultado);
        imprimir(resultadoUnido);
    }
}
