//punto de partida

//punto de partida
package Reto2;
import java.util.*;

public class CarreraParalela {
    public static void main(String[] args) {
        int mayor = numero();
        System.out.println("El número es: " + mayor);
    }

    private static int numero(){
        return 0;
    }
    private static int minimoNumero(){
        System.out.println("Ingrese los números separados por espacio:");
        try (Scanner scanner = new Scanner(System.in)) {
            String linea = scanner.nextLine();
            return Arrays.stream(linea.trim().split("\\s+"))
                .filter(s -> !s.isEmpty())
                .map(s -> {
                    try {
                        return Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .min(Integer::compareTo)
                .orElse(Integer.MAX_VALUE);
        }
    }
}


