package Reto1;

import java.util.List;
import java.util.stream.*;

public class MensajeBienvenida {

   public static String crearMensaje(List<Estudiante> estudiantes) {
    String mensaje ="¡Hola Bienvenidos! Nosotros somos la pareja conformada por ";
    String detalles = estudiantes.stream()
        .map(e -> String.format("%s estudiante de la escuela de %s semestre de %d años",
            e.getNombre(), (e.getSemestre() == 6 ? "6to" : e.getSemestre()),
            e.getEdad()))
        .collect(Collectors.joining(" y "));
        
    String correos = estudiantes.stream()
        .map(Estudiante::getEmail)
        .collect(Collectors.joining(" y "));

        return mensaje + detalles + ", nuestros correos institucionales son " + correos + ".";
   }
}
