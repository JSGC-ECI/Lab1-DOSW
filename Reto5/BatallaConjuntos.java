package Reto5;

import java.util.List;

import java.util.*;
public class BatallaConjuntos {
    private static TreeSet<Integer> resultado = new TreeSet<>();


    public static TreeSet<Integer> almacenar(List<Integer> numeros) {
		numeros.stream().filter(i -> i % 5 != 0).forEach(resultado::add);
		return resultado;
	}
}
