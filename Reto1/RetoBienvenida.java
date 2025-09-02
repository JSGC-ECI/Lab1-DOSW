package Reto1;

import java.util.*;

public class RetoBienvenida {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante("Juan Sebastián Guayazán Clavijo", 20, "juan.guayazan-c@mail.escuelaing.edu.co", 6),
            new Estudiante("Andres Cardozo Martinez", 20, "andres.cardozo-m@mail.escuelaing.edu.co", 6)
        );
        String mensaje = MensajeBienvenida.crearMensaje(estudiantes);
        System.out.println(mensaje);
    }
}