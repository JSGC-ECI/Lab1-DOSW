package Reto3;
<<<<<<< HEAD
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

=======
import java.util.stream.*;
public class Eco {
    

    public static String StringBuilder(String mensaje){
        StringBuilder eco = new StringBuilder();
        IntStream.range(0, 3)
                            .mapToObj(i -> mensaje)
                            .collect(Collectors.joining(" "));
        return eco.toString();
    }
    
    public static String ecoMisterioso(String mensaje){      
        return new StringBuilder(mensaje).reverse().toString();
    }
>>>>>>> c51448a8860afa70b690dd7aeaa1d1c319099cb7
}

