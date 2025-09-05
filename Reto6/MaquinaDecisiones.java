package Reto6;

public class MaquinaDecisiones {


    public static void decisiones(String decision) {
        switch (decision.toUpperCase()) {
            case "SALUDAR":
                System.out.println("¡Saludos, viajero del tiempo y del código!");
                break;
            case "DESPEDIR":
                System.out.println("Que los bits te acompañen, hasta la próxima misión.");
                break;
            case "CANTAR":
                System.out.println("01010101");
                break;
            case "DANZAR":
                System.out.println("Girando en modo fiesta.");
                break;

            default:
                System.out.println("Decisión no reconocida.");
                break;
        }
    }

    public static void main(String[] args) {
        decisiones("SALUDAR");
    }
    
}
