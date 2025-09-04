package Reto3;
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
}
