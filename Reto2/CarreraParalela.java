package Reto2;

import java.util.*;

public class CarreraParalela {

    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(3, 8, 1, 6, 2);
        List<Integer> lista2 = Arrays.asList(10, 7, 4, 12);

        Resultados resultados = calcularResultados(lista1, lista2);
        System.out.println(resultados);
    }

    /**
     * Fusión de toda la lógica: analiza dos listas y retorna el objeto Resultados.
     */
    public static Resultados calcularResultados(List<Integer> lista1, List<Integer> lista2) {
        int max1 = lista1.stream().max(Integer::compareTo).orElse(Integer.MIN_VALUE);
        int min1 = lista1.stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE);
        int cantidad1 = lista1.size();

        int max2 = lista2.stream().max(Integer::compareTo).orElse(Integer.MIN_VALUE);
        int min2 = lista2.stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE);
        int cantidad2 = lista2.size();

        // Condiciones con if ternario
        String mayor1Info = (max1 % 2 == 0) ? "Mayor múltiplo de 2" : "Mayor no múltiplo de 2";
        String cantidad1Info = (cantidad1 % 2 == 0) ? "Cantidad par" : "Cantidad impar";

        String mayor2Info = (max2 % 2 == 0) ? "Mayor múltiplo de 2" : "Mayor no múltiplo de 2";
        String cantidad2Info = (cantidad2 % 2 == 0) ? "Cantidad par" : "Cantidad impar";

        return new Resultados(
                max1, min1, cantidad1, mayor1Info, cantidad1Info,
                max2, min2, cantidad2, mayor2Info, cantidad2Info
        );
    }
}

/**
 * Objeto que contiene todos los resultados de ambas listas.
 */
class Resultados {
    private int max1, min1, cantidad1;
    private String mayor1Info, cantidad1Info;

    private int max2, min2, cantidad2;
    private String mayor2Info, cantidad2Info;

    public Resultados(int max1, int min1, int cantidad1, String mayor1Info, String cantidad1Info,
                      int max2, int min2, int cantidad2, String mayor2Info, String cantidad2Info) {
        this.max1 = max1;
        this.min1 = min1;
        this.cantidad1 = cantidad1;
        this.mayor1Info = mayor1Info;
        this.cantidad1Info = cantidad1Info;
        this.max2 = max2;
        this.min2 = min2;
        this.cantidad2 = cantidad2;
        this.mayor2Info = mayor2Info;
        this.cantidad2Info = cantidad2Info;
    }

    @Override
    public String toString() {
        return "Resultados: \n" +
                "Lista 1 -> Mayor=" + max1 + ", Menor=" + min1 + ", Cantidad=" + cantidad1 +
                ", " + mayor1Info + ", " + cantidad1Info + "\n" +
                "Lista 2 -> Mayor=" + max2 + ", Menor=" + min2 + ", Cantidad=" + cantidad2 +
                ", " + mayor2Info + ", " + cantidad2Info;
    }
}


