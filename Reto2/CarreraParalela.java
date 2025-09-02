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
    private static int minimoNumero(List<Integer> numeros){
        return numeros.stream()
                .min(Integer::compareTo)
                .orElse(Integer.MAX_VALUE);
    }
}


