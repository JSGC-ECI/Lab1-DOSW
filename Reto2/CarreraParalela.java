//punto de partida

package Reto2;
import java.util.*;
import java.util.stream.*;

public class CarreraParalela {
    public static void main(String[] args) {
        System.out.println("Ingrese los números separados por espacio:");
        List<Integer> numeros = leerNumeros();
    }
    private static List<Integer> leerNumeros() {
        Scanner scanner = new Scanner(System.in);
        String linea = scanner.nextLine();
        String[] partes = linea.split(" ");
        List<Integer> numeros = new ArrayList<>();
        for (String parte : partes) {
            try {
                numeros.add(Integer.parseInt(parte));
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida: " + parte);
            }
        }
        return numeros;
    }

    private static int minimoNumero(List<Integer> numeros){
        return numeros.stream()
                .min(Integer::compareTo)
                .orElse(Integer.MAX_VALUE);
    }

    private static int mayorNumero(List<Integer> numeros) {
        return numeros.stream()
                .max(Integer::compareTo)
                .orElse(Integer.MIN_VALUE); 
    }

<<<<<<< HEAD
    private static List<Integer> calcular (List<Integer> lista){
        int max = mayorNumero(lista);
        int min = minimoNumero(lista);

        //  mayor múltiplo de 2
        String resultadoMayor = (mayor % 2 == 0) ? "El mayor es múltiplo de 2" : "El mayor no es múltiplo de 2";
        System.out.println(resultadoMayor);

        // tamaño par o impar
        String resultadoParidad = (lista.size() % 2 == 0) ? "La lista tiene cantidad par de datos" : "La lista tiene cantidad impar de datos";
        System.out.println("Cantidad de elementos: " + lista.size());
        System.out.println(resultadoParidad);


        lista = Stream.of(max,min).collect(Collectors.toList());
        String esDivisorDe2 = (max % 2 == 0) ? "Es divisor de 2" : "No es divisor de 2";
        System.out.println(esDivisorDe2);
        
        int count = (int) lista.stream().count();
        String esImpar = (count % 2 == 0) ? "No es impar" : "Es impar";
        System.out.println(esImpar);
        return lista;
    }
 
}


