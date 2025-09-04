package Reto3;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Eco {
    public String invertirMensaje(String mensaje) {
        return new StringBuffer(mensaje).reverse().toString();
    }

    public String ecoMisterioso(String mensaje) {
        return invertirMensaje(IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" ")));
    }

}

