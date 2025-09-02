//punto de partida

package Reto2;
import java.util.*;

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

    public static List<Integer> MayorNum(List<Integer> lista) {
        return lista;
    }
}


