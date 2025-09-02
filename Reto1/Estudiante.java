package Reto1;

public class Estudiante {
    private String nombre;
    private int edad;
    private String email;
    private int semestre;

    public Estudiante(String nombre, int edad, String email, int semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getEmail() {
        return email;
    }

}
